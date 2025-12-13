package model;

public class circulo extends figura {
    private double radio;

    public circulo(String color, String tipoLinea, String nombre, double radio) {
        super(color, tipoLinea, nombre);
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return 3.1416 * (radio * 2);
    }

    @Override
    public void mostrarColor() {
        System.out.println("El color es: " + this.color);
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

}
