package ExamenB1;

public class Ticket_Comprado {
    String nombre_Coop;
    int num_boletos;

    public Ticket_Comprado(String nombre_Coop, int num_boletos) {
        this.nombre_Coop = nombre_Coop;
        this.num_boletos = num_boletos;
    }

    public String getNombre_Coop() {
        return nombre_Coop;
    }

    public void setNombre_Coop(String nombre_Coop) {
        this.nombre_Coop = nombre_Coop;
    }

    public int getNum_boletos() {
        return num_boletos;
    }

    public void setNum_boletos(int num_boletos) {
        this.num_boletos = num_boletos;
    }

    public double calcular_costo(){
        return 0.0;
    }
}
