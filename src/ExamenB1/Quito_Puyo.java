package ExamenB1;

public class Quito_Puyo extends Ruta{
    String ciudad_destino;
    double precio_QP;

    public Quito_Puyo(String nombre_Coop, int num_boletos, double precio, String ciudad_destino) {
        super(nombre_Coop, num_boletos, precio);
        this.ciudad_destino = ciudad_destino;
    }

    public String getCiudad_destino() {
        return ciudad_destino;
    }

    public void setCiudad_destino(String ciudad_destino) {
        this.ciudad_destino = ciudad_destino;
    }

    public double getPrecio_QP() {
        return precio_QP;
    }

    public void setPrecio_QP(double precio_QP) {
        this.precio_QP = precio_QP;
    }

    public double calcular_costo(){
        return precio_QP;
    }
}
