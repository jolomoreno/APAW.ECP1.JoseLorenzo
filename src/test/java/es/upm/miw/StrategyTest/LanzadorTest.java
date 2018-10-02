package es.upm.miw.StrategyTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import es.upm.miw.Strategy.*;

public class LanzadorTest {
    private Lanzador strategyEspacial;
    private Lanzador strategySigilo;
    private Lanzador strategyAcuatica;

    @BeforeEach
    void before() {
        strategyEspacial = new Lanzador(new ArmaduraEspacial());
        strategySigilo = new Lanzador(new ArmaduraSigilo());
        strategyAcuatica = new Lanzador(new ArmaduraAcuatica());
    }


    @Test
    void testStrategyEspacial() {
        assertEquals("ArmaduraEspacial", strategyEspacial.procesar());
    }

    @Test
    void testStrategySigilo() {
        assertEquals("ArmaduraSigilo", strategySigilo.procesar());
    }

    @Test
    void testStrategyAcuatica() {
        assertEquals("ArmaduraAcuatica", strategyAcuatica.procesar());
    }
}
