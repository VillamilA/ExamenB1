package ExamenB1;

public class Ruta extends Ticket_Comprado {
    double precio;

    public Ruta(String nombre_Coop, int num_boletos, double precio) {
        super(nombre_Coop, num_boletos);
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public double calcular_costo() {
        return precio;
    }
}