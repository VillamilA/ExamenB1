package ExamenB1;

public class Servicio extends Ruta {
    String tipo_servicio;

    public Servicio(String nombre_Coop, int num_boletos, double precio, String tipo_servicio) {
        super(nombre_Coop, num_boletos, precio);
        this.tipo_servicio = tipo_servicio;
    }

    public void setTipo_servicio(String tipo_servicio) {
        this.tipo_servicio = tipo_servicio;
    }

    public double costo_servicio() {
        return 0;
    }
}

