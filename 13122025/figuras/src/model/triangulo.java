package model;

public class triangulo extends figura {
    private double base;
    private double altura;

    public triangulo(String color, String tipoLinea, String nombre, double base, double altura) {
        super(color, tipoLinea, nombre);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }

    @Override
    public void mostrarColor() {
        System.out.println("El color del triangulo es: " + this.color);
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

}
