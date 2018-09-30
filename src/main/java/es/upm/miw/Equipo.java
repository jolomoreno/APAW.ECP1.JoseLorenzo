package es.upm.miw;

public class Equipo {
    private String id;
    private int num_corredores;
    private String nombre;

    Equipo(){
        this.id = "1";
        this.num_corredores = 0;
        this.nombre = "";
    }

    public Integer getNumCorredores(){
        return this.num_corredores;
    }

    public void setNumCorredores(int num_corredores){
        this.num_corredores = num_corredores;
    }
}
