package es.upm.miw;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EquipoTest {
    private Equipo equipo;

    @BeforeEach
    void before() {
        equipo = new Equipo();
    }

    @Test
    void testEquipo() {
        assertEquals(0, (int) equipo.getNumCorredores());
    }

    @Test
    void testSetDorsal() {
        equipo.setNumCorredores(7);
        assertEquals(7, (int) equipo.getNumCorredores());
    }
}
