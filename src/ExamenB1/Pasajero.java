package ExamenB1;

public class Pasajero extends Ticket_Comprado{
    int id_cliente;
    String cliente;

    public Pasajero(String nombre_Coop, int num_boletos, int id_cliente, String cliente) {
        super(nombre_Coop, num_boletos);
        this.id_cliente = id_cliente;
        this.cliente = cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public void mostrar_info(){
        System.out.print("El pasajero es "+ cliente+" con cedula: "+ id_cliente );
    }
}
