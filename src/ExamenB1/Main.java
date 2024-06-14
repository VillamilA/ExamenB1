package ExamenB1;

public class Main {
    public static void main(String[] args) {

        Ticket_Comprado ticket = new Ticket_Comprado("EL BUHO", 1);
        Pasajero pas1 = new Pasajero("EL BUHO", 1, 172802404, "Angel Villamil");
        pas1.mostrar_info();

        Ruta r1 = new Ruta("EL BUHO", 1, 20);
        Quito_Guayaquil r2 = new Quito_Guayaquil("EL BUHO", 1, 20.0, "Guayaquil",20.0);
        r2.calcular_costo();
        r2.costo_precioQG();
        Quito_Tulcan r3 = new Quito_Tulcan("EL BUHO", 1, 20.0, 17.50,"Tulcan");
        r3.calcular_costo();
        Quito_Puyo r4 = new Quito_Puyo("EL BUHO", 1, 15.0, "Puyo");

        qUITO_rIOBAMBA r5 = new qUITO_rIOBAMBA("EL BUHO", 1, 20.0, "Riombamba",17.50);

    }
}