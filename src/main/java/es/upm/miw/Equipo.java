package es.upm.miw;

import java.util.List;
import java.util.ArrayList;

public class Equipo {
    private String id;
    private int numCorredores;
    private String nombre;

    private List<CorredorSingleton> corredorList;
    private List<Competicion> competicionList;
    private Categoria categoria;

    Equipo(){
        this.id = "1";
        this.numCorredores = 0;
        this.nombre = "";
        this.corredorList = new ArrayList<>();
        this.competicionList = new ArrayList<>();
        this.categoria = Categoria.JUNIOR;
    }

    public Integer getNumCorredores(){
        return this.numCorredores;
    }

    public void setNumCorredores(int numCorredores){
        this.numCorredores = numCorredores;
    }
}
