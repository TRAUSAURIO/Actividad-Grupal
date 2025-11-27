public class CriaturaEnemiga {
    private String nombre;
    private int salud;
    private int dano;
    private TipoCriaturaEnemiga tipo;
    private int experiencia;

    public CriaturaEnemiga(String nombre, int salud, int dano, TipoCriaturaEnemiga tipo) {
        this.nombre = nombre;
        this.salud = salud;
        this.dano = dano;
        this.tipo = tipo;
        this.experiencia = salud / 2;
    }

    // Getters
    public String getNombre() { return nombre; }
    public int getSalud() { return salud; }
    public int getDano() { return dano; }
    public TipoCriaturaEnemiga getTipo() { return tipo; }
    public int getExperiencia() { return experiencia; }

    public void setSalud(int salud) { this.salud = salud; }

    public void atacar(PersonajeJugador jugador) {
        System.out.println(nombre + " ataca a " + jugador.getNombre());
        jugador.recibirDano(dano);
    }

    public void recibirDano(int cantidad) {
        salud -= cantidad;
        System.out.println(nombre + " recibe " + cantidad + " de daño");

        if (salud <= 0) {
            System.out.println("¡" + nombre + " fue derrotado!");
        }
    }

    public void mostrarInfo() {
        System.out.println(nombre + " [" + tipo + "]");
        System.out.println("Salud: " + salud + " | Daño: " + dano);
        System.out.println("Amenaza: " + tipo.getNivelAmenaza());
    }

    public boolean estaVivo() {
        return salud > 0;
    }
}