package edu.teamrocket.bici_palma.domain.estacion;

import edu.teamrocket.bici_palma.domain.bicicleta.Movil;
import edu.teamrocket.bici_palma.domain.tarjetaUsuario.Autenticacion;


public class Estacion {
    private final int id;
    private final String direccion;

    private final Anclajes anclajes;

    public Estacion(int id, String direccion, int numAnclajes) {
        this.id = id;
        this.direccion = direccion;
        this.anclajes = new Anclajes(numAnclajes);
    }

    private int getId() {
        return id;
    }

    private String getDireccion() {
        return direccion;
    }

    public String toString() {
        return "id: " + getId() + '\n' +
                "direccion: " + getDireccion() + '\n' +
                "numeroAnclajes: " + numAnclajes();

    }

    private Anclaje[] anclajes() {
        return this.anclajes.anclajes();
    }

    private int numAnclajes() {
        return this.anclajes.numAnclajes();
    }

    public void consultarEstacion() {
        System.out.println(this.toString());
    }

    public int anclajesLibres() {
        int anclajes_libres = 0;
        for (Anclaje anclaje : anclajes()) {
            if (!anclaje.isOcupado()) {
                anclajes_libres++;
            }
        }
        return anclajes_libres;
    }

    public void anclarBicicleta(Movil bici) {
        if (anclajesLibres() > 0) {
            int posicion = this.anclajes.seleccionarAnclaje();
            this.anclajes()[posicion].anclarBici(bici);
        } else {
            System.out.println("No hay anclajes libres");
        }
    }

    public boolean leerTarjetaUsuario(Autenticacion TarjetaUsuario) {
        return TarjetaUsuario.isActivada();

    }

    private void mostrarBicicleta(Movil bicicleta, int numAnclaje) {
        System.out.println("Bicicleta en el anclaje " + numAnclaje + ": " + bicicleta.toString());
    }


    public void retirarBicicleta(Autenticacion TarjetaUsuario) {
        if (leerTarjetaUsuario(TarjetaUsuario)) {
            int numAnclaje = 1;
            for (Anclaje anclaje : anclajes()) {
                if (anclaje.isOcupado()) {
                    Movil bici = anclaje.getBici();
                    mostrarBicicleta(bici, numAnclaje);
                    anclaje.liberarBici();
                    return;
                }
                numAnclaje++;
            }
        } else {
            System.out.println("Tarjeta de usuario no válida");
        }
    }

    public void consultarAnclajes() {
        for (Anclaje anclaje : anclajes()) {
            System.out.println(anclaje.toString());
        }
    }
}
