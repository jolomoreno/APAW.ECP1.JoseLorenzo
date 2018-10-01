package es.upm.miw;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertSame;

public class CorredorSingletonTest {
    private CorredorSingleton corredor;

    @BeforeEach
    void before() {
        corredor = corredor.getCorredorSingleton();
    }

    @Test
    void testIsSingleton() {
        assertSame(corredor.getCorredorSingleton(), corredor.getCorredorSingleton());
    }

    @Test
    void testSingletonNotNull() {
        assertNotNull(corredor.getCorredorSingleton());
    }

    @Test
    void testSetDorsal() {
        corredor.setDorsal(7);
        assertEquals(7, (int) corredor.getDorsal());
    }
}
