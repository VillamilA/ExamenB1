package ExamenB1;

public class Quito_Tulcan extends Ruta {
    double precio_QT;
    String C_destino;

    public Quito_Tulcan(String nombre_Coop, int num_boletos, double precio, double precio_QT, String c_destino) {
        super(nombre_Coop, num_boletos, precio);
        this.precio_QT = precio_QT;
        C_destino = c_destino;
    }

    public double getPrecio_QT() {
        return precio_QT;
    }

    public void setPrecio_QT(double precio_QT) {
        this.precio_QT = precio_QT;
    }

    public String getC_destino() {
        return C_destino;
    }

    public void setC_destino(String c_destino) {
        C_destino = c_destino;
    }

    @Override
    public double calcular_costo(){
        return precio_QT+calcular_costo();
    }
}
