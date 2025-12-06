import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        List<Figura> lienzo = new ArrayList<>();

     /*    Figura miFigura = new CirculFo(null, 0);
        Figura otraFigura = new Rectangulo(null, 0, 0); */

        lienzo.add(new CirculFo("rojo", 5));
        lienzo.add(new Rectangulo("Azul", 6, 9));


        for (Figura f : lienzo) {
            System.out.println("Figura de color " + f.color);
            // Late Binding: Decide qué método usar en tiempo de ejecución
            System.out.println(f.calcularArea());
            System.out.println("-----------------");
        }

    }
}
