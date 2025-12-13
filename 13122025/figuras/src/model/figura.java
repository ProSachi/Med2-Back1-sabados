package model;

public abstract class figura {

    protected String color;
    protected String tipoLinea;
    protected String nombre;

public figura() {
    }

public figura(String color, String tipoLinea, String nombre) {
        this.color = color;
        this.tipoLinea = tipoLinea;
        this.nombre = nombre;
    }

public abstract double calcularArea();

public void mostrarColor(){
System.out.println("El color es:" + this.color);

}

public String getColor() {
    return color;
}

public void setColor(String color) {
    this.color = color;
}

public String getTipoLinea() {
    return tipoLinea;
}

public void setTipoLinea(String tipoLinea) {
    this.tipoLinea = tipoLinea;
}

public String getNombre() {
    return nombre;
}

public void setNombre(String nombre) {
    this.nombre = nombre;
}

}
