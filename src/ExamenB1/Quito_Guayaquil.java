package ExamenB1;

public class Quito_Guayaquil extends Ruta{
    String ciudad_destino;
    double precio_QG;

    public Quito_Guayaquil(String nombre_Coop, int num_boletos, double precio, String ciudad_destino, double precio_QG) {
        super(nombre_Coop, num_boletos, precio);
        this.ciudad_destino = ciudad_destino;
        this.precio_QG = precio_QG;
    }

    public String getCiudad_destino() {
        return ciudad_destino;
    }

    public void setCiudad_destino(String ciudad_destino) {
        this.ciudad_destino = ciudad_destino;
    }

    public double getPrecio_QG() {
        return precio_QG;
    }

    public void setPrecio_QG(double precio_QG) {
        this.precio_QG = precio_QG;
    }

    @Override
    public double calcular_costo() {
        return precio_QG + calcular_costo();
    }
}

