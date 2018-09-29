package es.upm.miw;

public class Corredor {
    private String id;
    private String nombre;
    private int dorsal;

    public Corredor() {
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
