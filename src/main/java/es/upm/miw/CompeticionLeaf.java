package es.upm.miw;

public class CompeticionLeaf extends CompeticionComponent{

    private Competicion competicion;

    public CompeticionLeaf(Competicion competicion) {
        super(competicion.getId());
        this.competicion = competicion;
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

    public Competicion getCompeticion() {
        return competicion;
    }

    public String getLugar() {
        return competicion.getLugar();
    }
}
