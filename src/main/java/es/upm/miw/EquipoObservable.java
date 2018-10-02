package es.upm.miw;

import java.util.List;
import java.util.ArrayList;
import java.util.function.Consumer;

public class EquipoObservable {
    private String id;
    private int numCorredores;
    private String nombre;

    private List<CorredorSingleton> corredorList;
    private List<CompeticionComponent> competicionList;
    private Categoria categoria;

    private List<Consumer<String>> consumers;

    EquipoObservable(){
        this.id = "1";
        this.numCorredores = 0;
        this.nombre = "";
        this.corredorList = new ArrayList<>();
        this.competicionList = new ArrayList<>();
        this.categoria = Categoria.JUNIOR;
        this.consumers = new ArrayList<>();
    }

    public Integer getNumCorredores(){
        return this.numCorredores;
    }

    public void setNumCorredores(int numCorredores){
        this.numCorredores = numCorredores;
    }


    public Consumer<String> subscribe(Consumer<String> consumer) {
        this.consumers.add(consumer);
        return consumer;
    }

    public void unsubscribe(Consumer<String> consumer) {
        this.consumers.remove(consumer);
    }

    public void accept(String data) {
        this.consumers.forEach(c -> c.accept(data));
    }
}
