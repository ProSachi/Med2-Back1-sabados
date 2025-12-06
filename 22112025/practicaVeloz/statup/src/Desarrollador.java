public class Desarrollador extends Empleado {
    private String lenguajePrincipal;

    public Desarrollador() {
    }

    @Override
    public void tarea() {
        System.out.println("Yo soy un desarrollador");
    }

    public Desarrollador(String nombre, String id, double salarioBase, String lenguajePrincipal) {
        super(nombre, id, salarioBase);
        System.out.println("Constructor de Desarollador ejecutándose...");
        this.lenguajePrincipal = lenguajePrincipal;
    }

    public String getLenguajePrincipal() {
        return lenguajePrincipal;
    }

    public void setLenguajePrincipal(String lenguajePrincipal) {
        this.lenguajePrincipal = lenguajePrincipal;
    }

}
