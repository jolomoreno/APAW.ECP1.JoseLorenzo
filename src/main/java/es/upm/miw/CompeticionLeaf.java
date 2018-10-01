package es.upm.miw;

public class CompeticionLeaf extends CompeticionComponent{

    public CompeticionLeaf(String nombre) {
        super(nombre);
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
    public void get(int deep){
        System.out.println("-" + " " + this.name);
    }

    @Override
    public String getName(){
        return this.name;
    }
}
