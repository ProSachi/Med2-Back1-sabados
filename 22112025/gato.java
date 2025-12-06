public class gato {
    
private String nombre;
private String raza;
private String color;
private String estadoSalud;
private String tamano;
private int edad;
private int vidaDisponibles;
private String genero;

public gato() {
}
public gato(String nombre, String raza, String color, String estadoSalud, String tamano, int edad, int vidaDisponibles,
        String genero) {
    this.nombre = nombre;
    this.raza = raza;
    this.color = color;
    this.estadoSalud = estadoSalud;
    this.tamano = tamano;
    this.edad = edad;
    this.vidaDisponibles = vidaDisponibles;
    this.genero = genero;
}
public String getNombre() {
    return nombre;
}
public void setNombre(String nombre) {
    this.nombre = nombre;
}
public String getRaza() {
    return raza;
}
public void setRaza(String raza) {
    this.raza = raza;
}
public String getColor() {
    return color;
}
public void setColor(String color) {
    this.color = color;
}
public String getEstadoSalud() {
    return estadoSalud;
}
public void setEstadoSalud(String estadoSalud) {
    this.estadoSalud = estadoSalud;
}
public String getTamano() {
    return tamano;
}
public void setTamano(String tamano) {
    this.tamano = tamano;
}
public int getEdad() {
    return edad;
}
public void setEdad(int edad) {
    if (edad<0) {
        System.out.println("La edad no puede ser negativa");
    } else {
        this.edad = edad;
    }
    
}
public int getVidaDisponibles() {
    return vidaDisponibles;
}
public void setVidaDisponibles(int vidaDisponibles) {
    this.vidaDisponibles = vidaDisponibles;
}
public String getGenero() {
    return genero;
}
public void setGenero(String genero) {
    this.genero = genero;
}


}
