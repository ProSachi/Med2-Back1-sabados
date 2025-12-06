public class Impresora {
    // --- MÉTODOS SOBRECARGADOS (OVERLOAD) ---
    // Todos se llaman 'imprimir', pero aceptan diferentes parámetros.
    // Ocurren en la MISMA clase.

    public void imprimir(String texto) {
        System.out.println("Imprimiendo texto: " + texto);
    }

    public void imprimir(String texto, int copias) {
        System.out.println("Imprimiendo " + copias + " copias de: " + texto);
    }

    // --- MÉTODO QUE SERÁ SOBRESCRITO ---
    public void mostrarEstado() {
        System.out.println("Estado: Impresora genérica lista.");

    }
}
