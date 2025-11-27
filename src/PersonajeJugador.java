public class PersonajeJugador {
    private String nombre;
    private int salud;
    private int saludMaxima;
    private int poder;
    private TipoPersonaje tipo;
    private int nivel;
    private int experiencia;

    public PersonajeJugador(String nombre, int salud, int poder, TipoPersonaje tipo) {
        this.nombre = nombre;
        this.salud = salud;
        this.saludMaxima = salud;
        this.poder = poder;
        this.tipo = tipo;
        this.nivel = 1;
        this.experiencia = 0;
    }

    // Getters
    public String getNombre() { return nombre; }
    public int getSalud() { return salud; }
    public int getSaludMaxima() { return saludMaxima; }
    public int getPoder() { return poder; }
    public TipoPersonaje getTipo() { return tipo; }
    public int getNivel() { return nivel; }
    public int getExperiencia() { return experiencia; }

    public void setSalud(int salud) { this.salud = salud; }

    public void atacar(CriaturaEnemiga enemigo) {
        System.out.println(nombre + " ataca a " + enemigo.getNombre() + " con " + tipo.getRol());
        enemigo.recibirDano(poder);
    }

    public void recibirDano(int cantidad) {
        salud -= cantidad;
        System.out.println(nombre + " recibe " + cantidad + " de daño. Salud: " + salud);
    }

    public void ganarExperiencia(int exp) {
        experiencia += exp;
        System.out.println(nombre + " gana " + exp + " XP");

        if (experiencia >= nivel * 50) {
            subirNivel();
        }
    }

    private void subirNivel() {
        nivel++;
        saludMaxima += 10;
        salud = saludMaxima;
        poder += 3;
        experiencia = 0;
        System.out.println("¡" + nombre + " subió al nivel " + nivel + "!");
    }

    public void curar(int cantidad) {
        salud = Math.min(saludMaxima, salud + cantidad);
        System.out.println(nombre + " cura " + cantidad + " de salud");
    }

    public void mostrarEstado() {
        System.out.println("=== " + nombre + " ===");
        System.out.println("Nivel: " + nivel + " | XP: " + experiencia);
        System.out.println("Salud: " + salud + "/" + saludMaxima);
        System.out.println("Poder: " + poder + " | Clase: " + tipo);
    }
}