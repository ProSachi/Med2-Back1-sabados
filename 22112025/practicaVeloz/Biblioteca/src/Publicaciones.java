public class Publicaciones {

protected String titulo;
protected String autor;

public Publicaciones(String titulo, String autor) {
    this.titulo = titulo;
    this.autor = autor;
}

public String getTitulo() {
    return titulo;
}

public void setTitulo(String titulo) {
    this.titulo = titulo;
}

public String getAutor() {
    return autor;
}

public void setAutor(String autor) {
    this.autor = autor;
}
public void mostrarFicha () {
    System.out.println("El nombre del libro: " + this.titulo);
    
}
}
