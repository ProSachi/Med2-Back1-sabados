import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner leer = new Scanner(System.in);

        Moto laMaleducada = new Moto("BMW", 2026, "Doble");
        laMaleducada.acelerar();

        leer.close();

    }
}
