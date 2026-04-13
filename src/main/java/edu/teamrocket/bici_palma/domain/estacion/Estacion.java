package edu.teamrocket.bici_palma.domain.estacion;
import edu.teamrocket.bici_palma.domain.bicicleta.Movil;
import java.util.Optional;

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
        return anclajes.anclajes();
    }

    private int numAnclajes() {
        return anclajes.numAnclajes();
    }

    public void consultarEstacion() {
        System.out.println(this.toString());
    }

    public int anclajesLibres() {
        int anclajes_libres = 0;
        for (int i = 0; i < numAnclajes(); i++) {
            if (!anclajes.isAnclajeOcupado(i)) {
                anclajes_libres++;
            }
        }
        return anclajes_libres;
    }
    
    public void anclarBici(Movil bici){
        Optional<Anclaje> anclajesLibres = Optional.empty();
        if (anclajesLibres.isPresent()) {
            anclajesLibres.get().anclarBici(bici);
            
            
        } else {
            System.out.println("No hay anclajes libres");
        }
    }
}