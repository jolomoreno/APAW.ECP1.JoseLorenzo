package es.upm.miw.Strategy;

public class Lanzador {
    private ILanzador strategy;
    // ----------------------------------
    public Lanzador(ILanzador strategy) {
        this.strategy = strategy;
    }
    // ----------------------------------
    public String procesar() {
        return strategy.realizarLanzamiento();
    }
}
