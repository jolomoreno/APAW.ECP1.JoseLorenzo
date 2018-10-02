package es.upm.miw;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class CompeticionComposite extends CompeticionComponent{

    private ArrayList<CompeticionComponent> competicionComponentList;

    private String competicionListString = "";

    public CompeticionComposite(String name, String id, LocalDateTime fecha, String lugar) {
        super(name, id, fecha, lugar);
        competicionComponentList = new ArrayList<>();
    }

    @Override
    public boolean isComposite() {
        return true;
    }

    @Override
    public void add(CompeticionComponent competicionComponent) {
        assert competicionComponent != null;
        competicionComponentList.add(competicionComponent);
    }

    @Override
    public void remove(CompeticionComponent competicionComponent) {
        assert competicionComponent != null;
        competicionComponentList.remove(competicionComponent);
    }

    @Override
    public String toString(int deep){
        competicionListString = this.name + " nivel: " + deep + "\r\n";
        for (int i = 0; i < competicionComponentList.size(); i++)
            competicionListString += competicionComponentList.get(i).toString(deep+1);

        return competicionListString;
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
    public LocalDateTime getFecha(){
        return fecha;
    }

    @Override
    public String getLugar(){
        return lugar;
    }
}
