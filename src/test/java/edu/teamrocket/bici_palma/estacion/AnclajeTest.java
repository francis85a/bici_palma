package edu.teamrocket.bici_palma.estacion;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import edu.teamrocket.bici_palma.domain.estacion.Anclaje;
import edu.teamrocket.bici_palma.domain.bicicleta.Bicicleta;


public class AnclajeTest {
    
    @Test
    public void anclarBiciTest() {
        Anclaje anclaje = new Anclaje();
        anclaje.anclarBici(new Bicicleta(911));
        assertThat(anclaje.isOcupado()).isTrue();
    }

    @Test
    public void getBiciTest() {
        Anclaje anclaje = new Anclaje();
        anclaje.anclarBici(new Bicicleta(911));
        assertThat(anclaje.isOcupado()).isTrue();
        anclaje.getBici();
        assertThat(anclaje.isOcupado()).isTrue();
    }

    @Test
    public void liberarBiciTest() {
        Anclaje anclaje = new Anclaje();
        anclaje.anclarBici(new Bicicleta(911));
        assertThat(anclaje.isOcupado()).isTrue();

        anclaje.liberarBici();
        assertThat(anclaje.isOcupado()).isFalse();
    }

}