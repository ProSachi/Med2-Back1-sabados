public class CirculFo extends Figura {

    private double radio;

    public CirculFo(String color, double radio) {
        super(color);
        this.radio = radio;
    }

    @Override
        public String calcularArea() {
        return "El radio es: " +Math.PI * radio * radio;
    }

}
