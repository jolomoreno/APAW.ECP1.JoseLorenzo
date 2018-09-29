package es.upm.miw;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BicicletaTest {
    private Bicicleta bicicleta;

    @BeforeEach
    void before() {
        bicicleta = new Bicicleta();
    }

    @Test
    void testBicicleta() {
        assertEquals(false, bicicleta.isHomologada());
        bicicleta.setHomologada();
        assertEquals(true, bicicleta.isHomologada());
    }
}
