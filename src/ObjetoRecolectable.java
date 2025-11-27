public class ObjetoRecolectable {
    private String nombre;
    private RarezaObjeto rareza;
    private int valor;
    private String tipo; // ARMA, POCION, ARMADURA
    private int durabilidad;

    public ObjetoRecolectable(String nombre, RarezaObjeto rareza, int valor, String tipo) {
        this.nombre = nombre;
        this.rareza = rareza;
        this.valor = valor;
        this.tipo = tipo;
        this.durabilidad = 100;
    }

    // Getters
    public String getNombre() { return nombre; }
    public RarezaObjeto getRareza() { return rareza; }
    public int getValor() { return valor; }
    public String getTipo() { return tipo; }
    public int getDurabilidad() { return durabilidad; }

    public void setDurabilidad(int durabilidad) { this.durabilidad = durabilidad; }

    public void usar() {
        if (durabilidad > 0) {
            durabilidad -= 10;
            System.out.println("Usando " + nombre + ". Durabilidad: " + durabilidad + "%");
        } else {
            System.out.println(nombre + " está destruido");
        }
    }

    public void reparar() {
        durabilidad = 100;
        System.out.println(nombre + " reparado");
    }

    public void mostrarInfo() {
        System.out.println(nombre + " [" + rareza + "]");
        System.out.println("Tipo: " + tipo + " | Valor: " + valor);
    }

    public boolean estaDestruido() {
        return durabilidad <= 0;
    }
}