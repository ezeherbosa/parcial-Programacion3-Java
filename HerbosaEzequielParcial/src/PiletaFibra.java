public class PiletaFibra extends Pileta implements CalcularVolumen{
    private int radio;
    private int profundidad;

    public PiletaFibra(int radio, int profundidad) {
        this.radio = radio;
        this.profundidad = profundidad;
    }

    public PiletaFibra(MarcaPileta marca, ColorPileta color, int radio, int profundidad) {
        super(marca, color);
        this.radio = radio;
        this.profundidad = profundidad;
    }


    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public int getProfundidad() {
        return profundidad;
    }

    public void setProfundidad(int profundidad) {
        this.profundidad = profundidad;
    }

    @Override
    public String toString() {
        return "PiletaFibra{" +
                "radio=" + radio +
                ", profundidad=" + profundidad +
                '}';
    }


    public double calcularVolumen(int radio, int profundidad) {
        return 3.14*radio*radio*profundidad;
    }
}
