public enum RarezaObjeto {
    COMUN("Alta", "Objeto común"),
    RARO("Media", "Objeto especial"),
    LEGENDARIO("Baja", "Objeto único");

    private String probabilidad;
    private String descripcion;

    RarezaObjeto(String probabilidad, String descripcion) {
        this.probabilidad = probabilidad;
        this.descripcion = descripcion;
    }

    public String getProbabilidad() { return probabilidad; }
    public String getDescripcion() { return descripcion; }
}