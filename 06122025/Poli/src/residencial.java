public class residencial extends contruccion {
    
private boolean tieneTerraza;
private boolean tieneParqueadero;
private String interior;

public residencial(int id, String nombre, String area, String direccion, boolean tieneTerraza, boolean tieneParqueadero,
        String interior) {
    super(id, nombre, area, direccion);
    this.tieneTerraza = tieneTerraza;
    this.tieneParqueadero = tieneParqueadero;
    this.interior = interior;
}

@Override
public void mensaje(){
System.out.println("Yo soy una vivienda residencial");
}

public boolean isTieneTerraza() {
    return tieneTerraza;
}

public void setTieneTerraza(boolean tieneTerraza) {
    this.tieneTerraza = tieneTerraza;
}

public boolean isTieneParqueadero() {
    return tieneParqueadero;
}

public void setTieneParqueadero(boolean tieneParqueadero) {
    this.tieneParqueadero = tieneParqueadero;
}

public String getInterior() {
    return interior;
}

public void setInterior(String interior) {
    this.interior = interior;
}




}
