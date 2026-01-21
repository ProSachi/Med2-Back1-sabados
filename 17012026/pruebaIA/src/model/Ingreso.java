package model;

import java.time.LocalDate;

public class Ingreso extends Transaccion implements Reportable {

    private String categoria;

        public Ingreso() {
    }

    public Ingreso(String descripcion, double monto, LocalDate fecha, String categoria) {
        super(descripcion, monto, fecha);
        this.categoria = categoria;
    }

    @Override
    public String obtenerDetalle() {
        return "Ingreso: " + descripcion + " | Monto: +$" + monto + " | Categoría: " + categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String generarResumen() {
        return String.format(
                "Resumen de Ingreso [\n  Descripción: %s\n  Monto: +$%.2f\n  Fecha: %s\n  Categoría: %s\n]",
                descripcion, monto, fecha, categoria);
    }
}
