public enum TipoCriaturaEnemiga {
    BESTIA("Media", "Fuerza bruta"),
    NO_MUERTO("Alta", "Resistente al daño"),
    DEMONIO("Muy Alta", "Muy poderoso");

    private String nivelAmenaza;
    private String descripcion;

    TipoCriaturaEnemiga(String nivelAmenaza, String descripcion) {
        this.nivelAmenaza = nivelAmenaza;
        this.descripcion = descripcion;
    }

    public String getNivelAmenaza() { return nivelAmenaza; }
    public String getDescripcion() { return descripcion; }
}