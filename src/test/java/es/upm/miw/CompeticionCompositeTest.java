package es.upm.miw;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CompeticionCompositeTest {

    private CompeticionComposite root, composite;
    private CompeticionLeaf leaf, leaf2, leaf3;


    @BeforeEach
    void before() {
        this.root = new CompeticionComposite("Competiciones en España", "1", LocalDateTime.now(), "España");

        leaf = new CompeticionLeaf("VoltaCatalunya","1", LocalDateTime.now(), "Catalunya");

        root.add(leaf);

        leaf2 = new CompeticionLeaf("VueltaBurgos","1", LocalDateTime.now(), "Castilla Y Leon");

        root.add(leaf2);

        leaf3 = new CompeticionLeaf("Competiciones en Comunidad Valenciana","1", LocalDateTime.now(), "Comunidad Valenciana");

        root.add(leaf3);

        this.composite = new CompeticionComposite("Competiciones en Madrid","1", LocalDateTime.now(), "Comunidad de Madrid");

        composite.add(new CompeticionLeaf("Vuelta a Alcorcon","1", LocalDateTime.now(), "Comunidad de Madrid"));

        composite.add(new CompeticionLeaf("Vuelta a Alcala de Henares","1", LocalDateTime.now(), "Comunidad de Madrid"));

        root.add(composite);
    }

    @Test
    void testToString() {
        System.out.println(root.toString(1));
    }

    @Test
    void testRoot() {
        assertEquals("1", root.getId());
        assertEquals("Competiciones en España", root.getName());
        assertEquals("España", root.getLugar());
        assertEquals(true, root.isComposite());
    }

    @Test
    void testComposite() {
        assertEquals("1", composite.getId());
        assertEquals("Competiciones en Madrid", composite.getName());
        assertEquals("Comunidad de Madrid", composite.getLugar());
        assertEquals(true, composite.isComposite());
    }


    @Test
    void testLeaf() {
        assertEquals("1", leaf.getId());
        assertEquals("VoltaCatalunya", leaf.getName());
        assertEquals("Catalunya", leaf.getLugar());
        assertEquals(false, leaf.isComposite());
    }

    @Test
    void testToStringWithoutRemoveLeaf() {
        root.remove(leaf3);
        System.out.println(root.toString(1));
    }
}
