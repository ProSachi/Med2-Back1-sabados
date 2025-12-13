import model.Avion;

import model.Volador;
import model.pajaro;

public class App {
    public static void main(String[] args) throws Exception {

        Volador avion = new Avion("dos", "blancos");
        Volador pajaro = new pajaro("Dos alas naturales", "Verde");

        avion.despegar();
        avion.aterrizar();
        avion.volar();

        pajaro.despegar();
        pajaro.aterrizar();
        pajaro.volar();



    }
}
