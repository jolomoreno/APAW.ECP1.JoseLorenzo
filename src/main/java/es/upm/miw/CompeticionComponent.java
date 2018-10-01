package es.upm.miw;

public abstract class CompeticionComponent {
    private String name;

    public CompeticionComponent(String name) {
        this.name = name;
    }

    public abstract boolean isComposite();

    public abstract void add(CompeticionComponent articleComponent);

    public abstract void remove(CompeticionComponent articleComponent);
}
