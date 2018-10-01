package es.upm.miw;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CompeticionCompositeTest {

    private CompeticionComposite composite, composite2;
    private CompeticionLeaf leaf, leaf2, leaf3;


    @BeforeEach
    void before() {
        this.composite = new CompeticionComposite("Competiciones en España", "1", LocalDateTime.now(), "España");

        leaf = new CompeticionLeaf("VoltaCatalunya","1", LocalDateTime.now(), "España");

        composite.add(leaf);

        leaf2 = new CompeticionLeaf("VueltaBurgos","1", LocalDateTime.now(), "España");

        composite.add(leaf2);

        this.composite2 = new CompeticionComposite("Competiciones en Madrid","1", LocalDateTime.now(), "España");

        composite2.add(new CompeticionLeaf("Vuelta a Alcorcon","1", LocalDateTime.now(), "España"));

        composite2.add(new CompeticionLeaf("Vuelta a Alcala de Henares","1", LocalDateTime.now(), "España"));

        composite.add(composite2);

        composite.add(new CompeticionLeaf("Competiciones en Euskadi","1", LocalDateTime.now(), "España"));

        leaf3 = new CompeticionLeaf("Competiciones en Comunitat Valenciana","1", LocalDateTime.now(), "España");

        composite.add(leaf3);

        composite.remove(leaf3);
    }

    @Test
    void testLeafIsComposite() {
        System.out.println(composite.toString(1));

    }
}
