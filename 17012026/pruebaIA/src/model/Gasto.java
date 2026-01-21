package model;

import java.time.LocalDate;

public class Gasto extends Transaccion implements Reportable {

    private String categoria;

    public Gasto() {
    }

    public Gasto(String descripcion, double monto, LocalDate fecha, String categoria) {
        super(descripcion, monto, fecha);
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String obtenerDetalle() {
        return "GASTO: " + descripcion + " | Monto: -$" + monto + " | Categoría: " + categoria;
    }

    @Override
    public String generarResumen() {
        return String.format("Resumen de Gasto [\n  Descripción: %s\n  Monto: $%.2f\n  Fecha: %s\n  Categoría: %s\n]",
                descripcion, monto, fecha, categoria);
    }

}
