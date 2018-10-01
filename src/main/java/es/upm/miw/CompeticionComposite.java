package es.upm.miw;

import java.util.ArrayList;
import java.util.List;

public class CompeticionComposite extends CompeticionComponent{

    private ArrayList<CompeticionComponent> competicionComponentList;

    public CompeticionComposite(String name) {
        super(name);
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
    public String getName(){
        return this.name;
    }

    @Override
    public void get(int deep){
        for (int i = 0; i < competicionComponentList.size(); i++)
            competicionComponentList.get(i).get(deep+1);
    }


}
