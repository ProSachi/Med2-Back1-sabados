package model;

public class cuadrado extends figura {
    private double lado;

    public cuadrado(String color, String tipoLinea, String nombre, double lado) {
        super(color, tipoLinea, nombre);
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }

    @Override
    public void mostrarColor() {
        System.out.println("El color del cuadrado es: " + this.color);
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

}
