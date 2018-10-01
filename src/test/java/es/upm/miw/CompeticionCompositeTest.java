package es.upm.miw;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CompeticionCompositeTest {

    private Competicion competicion;
    private CompeticionComposite composite;
    private CompeticionLeaf leaf, leaf2, leaf3;


    @BeforeEach
    void before() {
        this.competicion = new Competicion();

        this.composite = new CompeticionComposite("TourDeFrancia");

        this.leaf = new CompeticionLeaf(competicion);

        this.composite.add(leaf);
    }

    @Test
    void testLeafIsComposite() {
        assertEquals(false, this.leaf.isComposite());
        assertEquals("asdas", this.leaf.toString());

        int size=composite.competicionComponentList.size();

        for(int x=0;x<size;x++) {
            System.out.println(composite.competicionComponentList.get(x));
        }
    }
}
