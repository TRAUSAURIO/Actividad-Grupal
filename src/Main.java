/**
 * Clase principal que inicia el videojuego "Legends of Aether"
 */
public class Main {
    public static void main(String[] args) {
        // Creación del personaje jugador
        PersonajeJugador jugador = new PersonajeJugador("Arkanos", 120, 40, TipoPersonaje.MAGO);

        // Creación de enemigos
        CriaturaEnemiga enemigo1 = new CriaturaEnemiga("Gólem de Huesos", 100, 25, TipoCriaturaEnemiga.NO_MUERTO);
        CriaturaEnemiga enemigo2 = new CriaturaEnemiga("Lobo Salvaje", 80, 20, TipoCriaturaEnemiga.BESTIA);

        // Creación de objetos
        ObjetoRecolectable pocion = new ObjetoRecolectable("Poción de Vida", RarezaObjeto.COMUN, 30, "POCION");
        ObjetoRecolectable espada = new ObjetoRecolectable("Espada de Acero", RarezaObjeto.RARO, 80, "ARMA");

        // Configuración del nivel
        Nivel nivel = new Nivel(1, jugador);
        nivel.agregarEnemigo(enemigo1);
        nivel.agregarEnemigo(enemigo2);
        nivel.agregarObjeto(pocion);
        nivel.agregarObjeto(espada);

        // Ejecución del juego
        System.out.println("=== LEYENDAS DE AETHER ===");
        System.out.println();

        // Mostrar estado inicial
        jugador.mostrarEstado();
        System.out.println();

        // Mostrar información del nivel
        nivel.mostrarEstado();
        System.out.println();

        // Iniciar combate
        nivel.iniciarCombate();
        System.out.println();

        // Recolectar objetos si el nivel se completó
        if (nivel.isCompletado()) {
            nivel.recolectarObjetos();
        }

        // Mostrar estado final
        System.out.println();
        jugador.mostrarEstado();
    }
}