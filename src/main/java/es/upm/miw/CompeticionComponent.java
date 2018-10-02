package es.upm.miw;

import java.time.LocalDateTime;

public abstract class CompeticionComponent {
    protected String name;
    protected String id;
    protected LocalDateTime fecha;
    protected String lugar;

    public CompeticionComponent(String name, String id, LocalDateTime fecha, String lugar) {
        this.name = name;
        this.id = id;
        this.fecha = fecha;
        this.lugar = lugar;
    }

    public abstract boolean isComposite();

    public abstract void add(CompeticionComponent competicionComponent);

    public abstract void remove(CompeticionComponent competicionComponent);

    public abstract String toString(int deep);

    public abstract String getName();
    public abstract String getId();
    public abstract LocalDateTime getFecha();
    public abstract String getLugar();
}
