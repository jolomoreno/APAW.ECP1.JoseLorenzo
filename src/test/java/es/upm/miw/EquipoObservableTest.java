package es.upm.miw;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.apache.logging.log4j.LogManager;

import java.util.function.Consumer;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EquipoObservableTest {
    private EquipoObservable equipoObservable;

    @BeforeEach
    void before() {
        equipoObservable = new EquipoObservable();
    }

    @Test
    void testEquipo() {
        assertEquals(0, (int) equipoObservable.getNumCorredores());
    }

    @Test
    void testSetDorsal() {
        equipoObservable.setNumCorredores(7);
        assertEquals(7, (int) equipoObservable.getNumCorredores());
    }

    @Test
    void testObservable() {
        EquipoObservable equipoObservable = new EquipoObservable();
        Consumer<String> subscription = equipoObservable.subscribe(s -> LogManager.getLogger(this.getClass()).info("Funciona!!! " + s));
        equipoObservable.accept("dato1");
        equipoObservable.accept("dato2");
        equipoObservable.unsubscribe(subscription);
        equipoObservable.accept("dato3");
    }
}
