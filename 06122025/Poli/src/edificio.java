public class edificio extends contruccion{
    
private String pisos;
private String numeroApartamento;
private String bloque;
private boolean tieneAscensor;
private boolean tienePiscina;



public edificio(int id, String nombre, String area, String direccion) {
    super(id, nombre, area, direccion);
}

public edificio(int id, String nombre, String area, String direccion, String pisos, String numeroApartamento,
        String bloque, boolean tieneAscensor, boolean tienePiscina) {
    super(id, nombre, area, direccion);
    this.pisos = pisos;
    this.numeroApartamento = numeroApartamento;
    this.bloque = bloque;
    this.tieneAscensor = tieneAscensor;
    this.tienePiscina = tienePiscina;
}

@Override
public void mensaje(){
System.out.println("Yo soy un edificio");
}

public String getPisos() {
    return pisos;
}

public void setPisos(String pisos) {
    this.pisos = pisos;
}

public String getNumeroApartamento() {
    return numeroApartamento;
}

public void setNumeroApartamento(String numeroApartamento) {
    this.numeroApartamento = numeroApartamento;
}

public String getBloque() {
    return bloque;
}

public void setBloque(String bloque) {
    this.bloque = bloque;
}

public boolean isTieneAscensor() {
    return tieneAscensor;
}

public void setTieneAscensor(boolean tieneAscensor) {
    this.tieneAscensor = tieneAscensor;
}

public boolean isTienePiscina() {
    return tienePiscina;
}

public void setTienePiscina(boolean tienePiscina) {
    this.tienePiscina = tienePiscina;
}



}
