package ExamenB1;

public class Main {
    public static void main(String[] args) {

        Ticket_Comprado ticket = new Ticket_Comprado("EL BUHO", 1);
        Pasajero pas1 = new Pasajero("EL BUHO", 1, 172802404, "Angel Villamil");
        pas1.mostrar_info();
    }
}