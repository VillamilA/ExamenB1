package ExamenB1;

public class Normal extends Servicio{
   int num_asiento;
   int num_maletas;

    public Normal(String nombre_Coop, int num_boletos, double precio, String tipo_servicio, int num_asiento, int num_maletas) {
        super(nombre_Coop, num_boletos, precio, tipo_servicio);
        this.num_asiento = num_asiento;
        this.num_maletas = num_maletas;
    }

    public void setNum_asiento(int num_asiento) {
        this.num_asiento = num_asiento;
    }

    public void setNum_maletas(int num_maletas) {
        this.num_maletas = num_maletas;
    }

    public double calcular_costo(){
        return precio;
    }
}
