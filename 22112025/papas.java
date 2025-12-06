import java.util.Scanner;

public class papas {

    public static String saludar(String a, int b) {
        String saludo = "Saludo a " + a + " que tiene edad de: " + b;
        return saludo;
    }

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        /*
         * String nombre;
         * int edad;
         * System.out.println("¿Cuál es tu nombre?");
         * nombre = leer.next();
         * System.out.println("¿Cuál es tu edad?");
         * edad = leer.nextInt();
         * String elSaludo = saludar(nombre, edad);
         * 
         * System.out.println(elSaludo);
         */
        /* System.out.println(saludar(nombre, edad)); */
        /*
         * String edad2;
         * System.out.println("¿Cuál es tu edad?");
         * edad2 = leer.next();
         * 
         * int edad2Int = Integer.parseInt(edad2);
         * 
         * if (edad > edad2Int) {
         * System.out.println("Edad 1 es mayor a edad 2");
         * } else {
         * System.out.println("Edad 2 es mayor a edad 1");
         * }
         * 
         * edad2 = Integer.toString(edad2Int);
         */

        gato paco = new gato("silvestre", "Criollo", "Mixto",
                "Melo", "Grande", 2, 7, "No se le ve");

        System.out.println(paco.getNombre());

        leer.close();
    }

}
