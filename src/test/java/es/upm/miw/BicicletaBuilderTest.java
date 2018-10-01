package es.upm.miw;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BicicletaBuilderTest {

    @Test
    void testBicicletaBuilder() {

        BicicletaBuilder bicicletaBuilder = BicicletaBuilder.builder("1").marca("Orbea").homolgada().build();
        assertEquals("1", bicicletaBuilder.getId());
        assertEquals(true, bicicletaBuilder.getHomologada());
        assertEquals("Orbea", bicicletaBuilder.getMarca());
    }

}
