package es.upm.miw;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CategoriaTest {

    @Test
    void testCategoria() {
        assertEquals("SENIOR", Categoria.SENIOR.toString());
        assertEquals("JUNIOR", Categoria.JUNIOR.toString());
        assertEquals("ELITE", Categoria.ELITE.toString());
    }
}
