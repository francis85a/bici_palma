package edu.teamrocket.bici_palma.domain.estacion;

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
                "numAnclajes: " + numAnclajes() + '\n';

    }
}