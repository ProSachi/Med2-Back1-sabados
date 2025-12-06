public class contruccion {

    protected int id;
    protected String nombre;
    protected String area;
    protected String direccion;

    public contruccion(int id, String nombre, String area, String direccion) {
        this.id = id;
        this.nombre = nombre;
        this.area = area;
        this.direccion = direccion;
    }
    

    public void mensaje() {
        System.out.println("Soy una construcción");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

}
