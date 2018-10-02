package es.upm.miw.Strategy;

public class ArmaduraEspacial implements ILanzador {
    public ArmaduraEspacial() {
    }
    // -------------------------------
    @Override
    public String realizarLanzamiento()
    {
        return "ArmaduraEspacial";
    }
}
