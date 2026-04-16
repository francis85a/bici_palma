package edu.teamrocket.bici_palma.domain.estacion;

import edu.teamrocket.bici_palma.domain.bicicleta.Movil;

class Anclajes {

    private final Anclaje[] anclajes;

    Anclajes(int numAnclajes) {
        this.anclajes = new Anclaje[numAnclajes];
        crearAnclajes();
    }

    private void crearAnclajes() {
        for (int i = 0; i < numAnclajes(); i++) {
            anclajes[i] = new Anclaje();
        }
    }

    Anclaje[] anclajes() {
        return this.anclajes;
    }

    int numAnclajes() {
        return anclajes.length;
    }

    void ocuparAnclaje(int Movil) {
        anclajes[Movil].anclarBici(anclajes[Movil].getBici());
    }

    boolean isAnclajeOcupado(int Movil) {
        return anclajes[Movil].isOcupado();
    }

    void liberarAnclaje(int Movil) {
        anclajes[Movil].liberarBici();
    }

    Movil getBiciAt(int Movil) {
        return anclajes[Movil].getBici();
    }

    int seleccionarAnclaje() {

        for (int i = 0; i < numAnclajes(); i++) {
            if (!isAnclajeOcupado(i)) {
                return i;
            }
        }
        return -1;
    }

    public String toString(){
        StringBuilder cantidad_anclajes = new StringBuilder();
        for (int i = 0; i < numAnclajes(); i++) {
            cantidad_anclajes.append("Anclaje ").append(i).append(": ").append(anclajes[i].toString()).append('\n');
        }
        return cantidad_anclajes.toString();
    }
}