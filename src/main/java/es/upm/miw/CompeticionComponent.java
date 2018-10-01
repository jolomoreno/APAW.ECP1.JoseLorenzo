package es.upm.miw;

public abstract class CompeticionComponent {
    protected String name;

    public CompeticionComponent(String name) {
        this.name = name;
    }

    public abstract boolean isComposite();

    public abstract void add(CompeticionComponent competicionComponent);

    public abstract void remove(CompeticionComponent competicionComponent);

    public abstract void get(int deep);

    public abstract String getName();
}
