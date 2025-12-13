package model;

public class pajaro extends TipoVolador implements Volador {

    public pajaro(String numeroMotores, String color) {
        super(numeroMotores, color);    }

    @Override
    public void despegar() {
        System.out.println("El pájaro salta y bate sus alas para despegar.");
    }

    @Override
    public void volar() {
        System.out.println("El pájaro planea en las corrientes de aire.");
    }

}
