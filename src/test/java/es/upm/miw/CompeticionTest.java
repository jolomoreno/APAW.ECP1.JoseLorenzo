package es.upm.miw;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CompeticionTest {
    private Competicion competicion;

    @BeforeEach
    void before() {
        competicion = new Competicion();
    }

    @Test
    void testBicicleta() {
        assertEquals("", competicion.getLugar());
    }

    @Test
    void testsetLugar() {
        competicion.setLugar("Madrid");
        assertEquals("Madrid", competicion.getLugar());
    }
}
