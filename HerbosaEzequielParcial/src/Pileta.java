public class Pileta implements CalcularVolumen{

    private MarcaPileta marca;
    private ColorPileta color;

    public Pileta() {
    }

    public Pileta(MarcaPileta marca, ColorPileta color) {
        this.marca = marca;
        this.color = color;
    }

    public MarcaPileta getMarca() {
        return marca;
    }

    public void setMarca(MarcaPileta marca) {
        this.marca = marca;
    }

    public ColorPileta getColor() {
        return color;
    }

    public void setColor(ColorPileta color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Pileta{" +
                "marca=" + marca +
                ", color=" + color +
                '}';
    }


    @Override
    public int calcularVolumen() {
        return 0;
    }
}
