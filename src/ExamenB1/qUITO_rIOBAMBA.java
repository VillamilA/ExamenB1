package ExamenB1;

public class qUITO_rIOBAMBA extends Ruta {
    String destino;
    double precio_QR;

    public qUITO_rIOBAMBA(String nombre_Coop, int num_boletos, double precio, String destino, double precio_QR) {
        super(nombre_Coop, num_boletos, precio);
        this.destino = destino;
        this.precio_QR = precio_QR;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void setPrecio_QR(double precio_QR) {
        this.precio_QR = precio_QR;
    }

    public double calcular_costo(){
    return calcular_costo()+precio_QR;
    }
}
