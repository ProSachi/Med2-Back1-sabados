public class Libro extends Publicaciones{

private int numPaginas;

public Libro(String titulo, String autor, int numPaginas) {
    super(titulo, autor);
    this.numPaginas = numPaginas;
}
@Override
public void mostrarFicha () {
    super.mostrarFicha();
    System.out.println("El numero de paginas: " + this.numPaginas);

    
}
}
