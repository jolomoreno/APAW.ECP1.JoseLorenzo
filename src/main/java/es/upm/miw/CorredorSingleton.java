package es.upm.miw;

public class CorredorSingleton {
    private static final CorredorSingleton corredor = new CorredorSingleton();

    private String id;
    private String nombre;
    private int dorsal;

    public static CorredorSingleton getCorredorSingleton() {
        return corredor;
    }

    private CorredorSingleton() {
        this.id = "1";
        this.nombre = "";
        this.dorsal = 0;
    }

    public Integer getDorsal(){
        return this.dorsal;
    }

    public void setDorsal(Integer dorsal){
        this.dorsal = dorsal;
    }
}
