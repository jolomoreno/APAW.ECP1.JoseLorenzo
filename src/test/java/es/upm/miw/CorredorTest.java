package es.upm.miw;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CorredorTest {
    private Corredor corredor;

    @BeforeEach
    void before() {
        corredor = new Corredor();
    }

    @Test
    void testCorredor() {
        assertEquals(0, (int) corredor.getDorsal());
    }

    @Test
    void testSetDorsal() {
        corredor.setDorsal(7);
        assertEquals(7, (int) corredor.getDorsal());
    }
}
