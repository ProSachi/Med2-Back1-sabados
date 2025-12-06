public class Gerente extends Empleado {
    private String proyecto;

    public Gerente() {
    }

    @Override
    public void tarea() {
        System.out.println("Yo soy un Gerente");
    }

    public Gerente(String nombre, String id, double salarioBase, String proyecto) {
        super(nombre, id, salarioBase);
        System.out.println("Constructor de Gerente ejecutándose...");
        this.proyecto = proyecto;
    }

    public String getProyecto() {
        return proyecto;
    }

    public void setProyecto(String proyecto) {
        this.proyecto = proyecto;
    }

}
