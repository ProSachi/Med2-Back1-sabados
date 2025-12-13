import java.util.Scanner;

import model.circulo;
import model.cuadrado;
import model.figura;
import model.triangulo;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner leer = new Scanner(System.in);

        System.out.println("Que tipo de figura: ");
        String tipoFigura = leer.next();
        System.out.println("Que color es la figura: ");
        String color = leer.next();
        System.out.println("De que tipo es la linea: ");
        String linea = leer.next();
        System.out.println("Cómo se llama la figura: ");
        String nombre = leer.next();

        if (tipoFigura.equals("circulo")) {
            System.out.println("El area del circulo: ");
            double medida = leer.nextDouble();
            figura circo = new circulo(color, linea, nombre, medida);
            System.out.println("El area del circulo es: " + circo.calcularArea());
            circo.mostrarColor();
        } else if (tipoFigura.equals("triangulo")) {
            System.out.println("cual es la base del triangulo: ");
            double base = leer.nextDouble();
            System.out.println("cual es la altura del triangulo");
            double altura = leer.nextDouble();
            figura trianguis = new triangulo(color, linea, nombre, base, altura);
            System.out.println("El area del triangulo es: " + trianguis.calcularArea());
            trianguis.mostrarColor();
        } else {
            System.out.println("Cual es la medida del lado del cuadrado: ");
            double medida = leer.nextDouble();
            figura cuadri = new cuadrado(color, linea, nombre, medida);
            System.out.println("El area del cuadrado es: " + cuadri.calcularArea());
            cuadri.mostrarColor();
        }

        leer.close();
    }
}
