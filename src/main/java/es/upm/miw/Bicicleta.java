package es.upm.miw;

public class Bicicleta {
    private String id;
    private Boolean homolgada;
    private String marca;

    public Bicicleta() {
        this.id = "1";
        this.homolgada = false;
        this.marca = "";
    }

    public boolean isHomologada(){
        return this.homolgada == true;
    }

    public void setHomologada(){
        this.homolgada = true;
    }
}