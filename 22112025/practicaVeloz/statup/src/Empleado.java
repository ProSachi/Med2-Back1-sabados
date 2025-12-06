public class Empleado {
    protected String nombre;
    protected String id;
    protected double salarioBase;

    public Empleado() {
    }

    public void sumar(int a, int b){

    }

    public void tarea(){
        System.out.println("Yo soy un empleado razo");
    }


    public Empleado(String nombre, String id, double salarioBase) {
        System.out.println("Constructor de empleado ejecutándose...");
        this.nombre = nombre;
        this.id = id;
        this.salarioBase = salarioBase;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public double getSalarioBase() {
        return salarioBase;
    }
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    
}
