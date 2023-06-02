public class Venta {
    TipoPileta tipoPileta;
    private Cliente cliente;
    private int precio;

    public Venta(TipoPileta tipoPileta, Cliente cliente, int precio) {
        this.tipoPileta = tipoPileta;
        this.cliente = cliente;
        this.precio = precio;
    }

    public TipoPileta getTipoPileta() {
        return tipoPileta;
    }

    public void setTipoPileta(TipoPileta tipoPileta) {
        this.tipoPileta = tipoPileta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }


    @Override
    public String toString() {
        return "Venta{" +
                "tipoPileta=" + tipoPileta +
                ", cliente=" + cliente +
                ", precio=" + precio +
                '}';
    }






}
