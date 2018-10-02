package es.upm.miw;

import java.time.LocalDateTime;

public class CompeticionLeaf extends CompeticionComponent{

    public CompeticionLeaf(String name, String id, LocalDateTime fecha, String lugar) {
        super(name, id, fecha, lugar);
    }

    @Override
    public boolean isComposite() {
        return false;
    }

    @Override
    public void add(CompeticionComponent competicionComponent) {
        // Do nothing because is leaf
    }

    @Override
    public void remove(CompeticionComponent competicionComponent) {
        // Do nothing because is leaf
    }

    @Override
    public String toString(int deep){
        return("ID: " + this.id + " - " + this.name + " " + this.fecha+ " " + this.lugar + "\r\n");
    }

    @Override
    public String getId(){
        return id;
    }

    @Override
    public String getName(){
        return name;
    }

    @Override
    public String getLugar(){
        return lugar;
    }
}
