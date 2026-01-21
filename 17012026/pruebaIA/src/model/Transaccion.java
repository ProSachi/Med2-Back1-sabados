package model;

import java.time.LocalDate;

public abstract class Transaccion {

    protected String descripcion;
    protected double monto;
    protected LocalDate fecha;

    public Transaccion() {
    }



    public Transaccion(String descripcion, double monto, LocalDate fecha) {
        this.descripcion = descripcion;
        this.monto = monto;
        this.fecha = fecha;
    }

    

    public abstract String obtenerDetalle();

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

}
