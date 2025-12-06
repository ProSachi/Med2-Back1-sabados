public class ImpresoraColor extends Impresora{
    // --- MÉTODO SOBRESCRITO (OVERRIDE) ---
    // Ocurre en la SUBCLASE.
    // Tiene la misma firma que el método en la clase Impresora.
    @Override
    public void mostrarEstado() {
        System.out.println("Estado: Impresora a color con tinta al 85%.");
    }

}
