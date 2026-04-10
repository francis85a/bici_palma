package edu.teamrocket.bici_palma.domain.estacion;
import edu.teamrocket.bici_palma.domain.bicicleta.Movil;

public class Anclaje {
    private boolean ocupado;
    private Movil bici;

    public Anclaje() {
        this.ocupado = false;
        this.bici = null;
    }

    boolean isOcupado() {
        return ocupado;
    }

    Movil getBici() {
        return bici;
    }

    void anclarBici(Movil bici)
    {
        this.bici = bici;
        this.ocupado = true;
    }

    void liberarBici()
    {
        this.bici = null;
        this.ocupado = false;
    }

    @Override
    public String toString() {
        return "ocupado: " + isOcupado() + '\n' +
                "bici: " + getBici() + '\n';
    }
}