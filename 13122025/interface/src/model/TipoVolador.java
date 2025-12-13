package model;

public  abstract class TipoVolador {
    
protected String numeroMotores;
protected String color;
public TipoVolador(String numeroMotores, String color) {
    this.numeroMotores = numeroMotores;
    this.color = color;
}
public String getNumeroMotores() {
    return numeroMotores;
}
public void setNumeroMotores(String numeroMotores) {
    this.numeroMotores = numeroMotores;
}
public String getColor() {
    return color;
}
public void setColor(String color) {
    this.color = color;
}


}
