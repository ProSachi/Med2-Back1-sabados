package model;

public class Avion extends TipoVolador implements Volador {

    public Avion(String numeroMotores, String color) {
        super(numeroMotores, color);
    }

    @Override
    public void despegar() {
        System.out.println("El avión despega usando la pista");
    }

    @Override
    public void volar() {
        System.out.println("El avión vuela con motores a reacción");
    }

}
