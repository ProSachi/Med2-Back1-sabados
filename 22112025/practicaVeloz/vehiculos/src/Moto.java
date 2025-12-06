public class Moto extends Vehiculo {
    private String gato;

    public Moto(int year, String gato) {
        super(year);
        this.gato = gato;
    }

    public Moto(String gato) {
        this.gato = gato;
    }

    public Moto(String marca, int year, String gato) {
        super(marca, year);
        this.gato = gato;
    }

    lista[] = []

    @Override
        public String acelerar() {
        String descripcionBase = super.acelerar();
        return descripcionBase + "Oh! es una moto";
    }

}
