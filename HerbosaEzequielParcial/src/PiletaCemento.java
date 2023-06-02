public class PiletaCemento extends Pileta implements CalcularVolumen{

    private int largo;
    private int ancho;
    private int profundidad;

    public PiletaCemento(int largo, int ancho, int profundidad) {
        this.largo = largo;
        this.ancho = ancho;
        this.profundidad = profundidad;
    }

    public PiletaCemento(MarcaPileta marca, ColorPileta color, int largo, int ancho, int profundidad) {
        super(marca, color);
        this.largo = largo;
        this.ancho = ancho;
        this.profundidad = profundidad;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getProfundidad() {
        return profundidad;
    }

    public void setProfundidad(int profundidad) {
        this.profundidad = profundidad;
    }

    @Override
    public String toString() {
        return "PiletaCemento{" +
                "largo=" + largo +
                ", ancho=" + ancho +
                ", profundidad=" + profundidad +
                '}';
    }


    public int calcularVolumen(int largo, int ancho, int profundidad){
        return largo*ancho*profundidad;
    }

}
