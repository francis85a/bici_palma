package edu.teamrocket.bici_palma.domain.estacion;
import edu.teamrocket.bici_palma.domain.bicicleta.Movil;

public class Anclaje {
    private boolean ocupado;
    private Movil bici;

    public Anclaje() {
        this.ocupado = false;
        this.bici = null;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public Movil getBici() {
        return bici;
    }

    public void anclarBici(Movil bici)
    {
        this.bici = bici;
        this.ocupado = true;
    }

    public void liberarBici()
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