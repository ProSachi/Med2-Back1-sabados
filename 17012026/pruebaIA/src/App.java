import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import model.Gasto;
import model.Ingreso;
import model.Reportable;
import model.Transaccion;

public class App {
    public static void main(String[] args) throws Exception {
        List<Transaccion> transacciones = new ArrayList<>();
        
        transacciones.add(new Gasto("Compra supermercado", 150.50, LocalDate.now(), "Alimentación"));
        transacciones.add(new Ingreso("Pago nómina", 2500.00, LocalDate.now(), "Salario"));
        transacciones.add(new Gasto("Suscripción Netflix", 15.99, LocalDate.now(), "Entretenimiento"));

        System.out.println("--- Listado de Transacciones (Polimorfismo de Clase) ---");
        for (Transaccion t : transacciones) {
            // Se ejecuta el método obtenerDetalle() de la subclase correspondiente
            System.out.println(t.obtenerDetalle());
        }

        System.out.println("\n--- Resúmenes (Polimorfismo de Interfaz) ---");
        // Polimorfismo usando la interfaz Reportable
        List<Reportable> reportables = new ArrayList<>();
        for (Transaccion t : transacciones) {
            if (t instanceof Reportable) {
                reportables.add((Reportable) t);
            }
        }

        for (Reportable r : reportables) {
            System.out.println(r.generarResumen());
        }
    }
}
