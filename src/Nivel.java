import java.util.ArrayList;

public class Nivel {
    private int numero;
    private PersonajeJugador jugador;
    private ArrayList<CriaturaEnemiga> enemigos;
    private ArrayList<ObjetoRecolectable> objetos;
    private boolean completado;

    public Nivel(int numero, PersonajeJugador jugador) {
        this.numero = numero;
        this.jugador = jugador;
        this.enemigos = new ArrayList<>();
        this.objetos = new ArrayList<>();
        this.completado = false;
    }

    public void agregarEnemigo(CriaturaEnemiga enemigo) {
        enemigos.add(enemigo);
    }

    public void agregarObjeto(ObjetoRecolectable objeto) {
        objetos.add(objeto);
    }

    public void iniciarCombate() {
        if (enemigos.isEmpty()) {
            System.out.println("No hay enemigos en este nivel");
            return;
        }

        CriaturaEnemiga enemigo = enemigos.get(0);
        System.out.println("Combate: " + jugador.getNombre() + " vs " + enemigo.getNombre());

        while (jugador.getSalud() > 0 && enemigo.estaVivo()) {
            jugador.atacar(enemigo);
            if (enemigo.estaVivo()) {
                enemigo.atacar(jugador);
            }
        }

        if (!enemigo.estaVivo()) {
            jugador.ganarExperiencia(enemigo.getExperiencia());
            enemigos.remove(enemigo);
        }

        if (enemigos.isEmpty()) {
            completado = true;
            System.out.println("¡Nivel " + numero + " completado!");
        }
    }

    public void recolectarObjetos() {
        for (ObjetoRecolectable objeto : objetos) {
            System.out.println(jugador.getNombre() + " obtiene: " + objeto.getNombre());
        }
        objetos.clear();
    }

    public void mostrarEstado() {
        System.out.println("--- Nivel " + numero + " ---");
        System.out.println("Enemigos: " + enemigos.size() + " | Objetos: " + objetos.size());
        System.out.println("Completado: " + (completado ? "Sí" : "No"));
    }

    // Getters
    public int getNumero() { return numero; }
    public boolean isCompletado() { return completado; }
}