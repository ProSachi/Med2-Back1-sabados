public class Vehiculo {
    protected String marca;
    protected int year;

    public Vehiculo(int year) {
        this.year = year;
    }

    public Vehiculo() {
    }

    public Vehiculo(String marca, int year) {
        this.marca = marca;
        this.year = year;
    }

    public String acelerar() {
        String estado = "El vehículo está acelerando.";
        return estado;
    }

}
