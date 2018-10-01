package es.upm.miw;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CompeticionCompositeTest {

    private CompeticionComposite composite, composite2;
    private CompeticionLeaf leaf, leaf2, leaf3;


    @BeforeEach
    void before() {
        this.composite = new CompeticionComposite("Competiciones en España");

        leaf = new CompeticionLeaf("VoltaCatalunya");

        composite.add(leaf);

        leaf2 = new CompeticionLeaf("VueltaBurgos");

        composite.add(leaf2);

        this.composite2 = new CompeticionComposite("Competiciones en Madrid");

        composite2.add(new CompeticionLeaf("Vuelta a Alcorcon"));

        composite2.add(new CompeticionLeaf("Vuelta a Alcala de Henares"));

        composite.add(composite2);

        composite.add(new CompeticionLeaf("Competiciones en Euskadi"));

        leaf3 = new CompeticionLeaf("Competiciones en Comunitat Valenciana");

        composite.add(leaf3);

        //composite.remove(leaf3);
    }

    @Test
    void testLeafIsComposite() {
        composite.get(1);
    }
}
