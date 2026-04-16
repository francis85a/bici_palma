package edu.teamrocket.bici_palma.bicicleta;
import edu.teamrocket.bici_palma.domain.bicicleta.Bicicleta;
import edu.teamrocket.bici_palma.domain.bicicleta.Movil;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test; 

public class BicicletaTest {

    private static Bicicleta bici;    
    @BeforeAll
    public static void setup() {
        bici = new Bicicleta(999);
    }

    @Test
    public void constructorBiciTest() {
        assertThat(bici.getId()).isEqualTo(999);
    }

    @Test
    public void toStringTest() {
        assertThat(bici.toString()).isEqualTo("999");
    }

    @Test
    public void implementationMovilTest() {
        Movil movil = bici;
        assertThat(movil.getId()).isEqualTo(999);
    }
}
