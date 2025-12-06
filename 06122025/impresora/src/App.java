public class App {
    public static void main(String[] args) throws Exception {
        ImpresoraColor miImpresora = new ImpresoraColor();

        System.out.println("--- Demostración de SOBRECARGA ---");
        // Java sabe cuál método llamar basándose en los argumentos que le pasas.
        miImpresora.imprimir("Hola Mundo");        // Llama al método con un parámetro.
        miImpresora.imprimir("Reporte Anual", 5); // Llama al método con dos parámetros.

        System.out.println("\n--- Demostración de SOBRESCRITURA ---");
        // Aunque el método existe en la clase padre, se ejecuta la versión
        // de la clase hija porque fue sobrescrito.
        miImpresora.mostrarEstado(); 
    }

}
