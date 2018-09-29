package es.upm.miw;

import java.time.LocalDateTime;

public class Competicion {
    private String id;
    private LocalDateTime fecha;
    private String lugar;

    public Competicion() {
        this.id = "1";
        this.fecha = LocalDateTime.now();
        this.lugar = "";
    }

    public String getLugar(){
        return this.lugar;
    }

    public void setLugar(String lugar){
        this.lugar = lugar;
    }
}