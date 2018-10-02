package es.upm.miw;

public class BicicletaBuilder {
    private String id;
    private Boolean homologada;
    private String marca;

    public BicicletaBuilder(String id) {
        this.id = id;
        this.homologada = false;
    }

    public static Builder builder(String id) {
        return new Builder(id);
    }

    public String getId() {
        return id;
    }

    public Boolean getHomologada() {
        return homologada;
    }

    public String getMarca() {
        return marca;
    }

    public static class Builder {
        private BicicletaBuilder bicicletaBuilder;

        private Builder(String id) {
            this.bicicletaBuilder = new BicicletaBuilder(id);
        }

        public Builder homolgada() {
            this.bicicletaBuilder.homologada = true;
            return this;
        }

        public Builder marca(String marca) {
            this.bicicletaBuilder.marca = marca;
            return this;
        }

        public BicicletaBuilder build() {
            return this.bicicletaBuilder;
        }
    }


}