public enum TipoPersonaje {
    GUERRERO("Tanque", "Combate cuerpo a cuerpo"),
    MAGO("Daño mágico", "Ataques a distancia"),
    ARQUERO("Precisión", "Ataques rápidos");

    private String rol;
    private String descripcion;

    TipoPersonaje(String rol, String descripcion) {
        this.rol = rol;
        this.descripcion = descripcion;
    }

    public String getRol() { return rol; }
    public String getDescripcion() { return descripcion; }
}