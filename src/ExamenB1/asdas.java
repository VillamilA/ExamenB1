public class Ticket_Comprado {
    private String nombreCoop;
    private int num_boletos;

    public Ticket_Comprado(String nombreCoop, int num_boletos) {
        this.nombreCoop = nombreCoop;
        this.num_boletos = num_boletos;
    }

    public double calcular_costo() {
        // Implementar la lógica para calcular el costo del ticket
        // teniendo en cuenta el nombreCoop y el num_boletos
        return 0.0;
    }
}

public class Ruta {
    private double precio;

    public Ruta(double precio) {
        this.precio = precio;
    }

    public double calcular_costo() {
        // Implementar la lógica para calcular el costo de la ruta
        // teniendo en cuenta el precio
        return 0.0;
    }
}

public class Pasajero {
    private String cliente;
    private int id_cliente;

    public Pasajero(String cliente, int id_cliente) {
        this.cliente = cliente;
        this.id_cliente = id_cliente;
    }

    public double mostrar_info() {
        // Implementar la lógica para mostrar la información del pasajero
        // utilizando cliente e id_cliente
        return 0.0;
    }
}

public class Quito_Guayaquil {
    private String ciudadDestino;
    private double precio_QG;

    public Quito_Guayaquil(String ciudadDestino, double precio_QG) {
        this.ciudadDestino = ciudadDestino;
        this.precio_QG = precio_QG;
    }

    public double calcular_costo() {
        // Implementar la lógica para calcular el costo de la ruta Quito-Guayaquil
        // teniendo en cuenta el precio_QG
        return 0.0;
    }
}

public class Quito_Tulcan {
    private String ciudaddestino;
    private double precio_QT;

    public Quito_Tulcan(String ciudaddestino, double precio_QT) {
        this.ciudaddestino = ciudaddestino;
        this.precio_QT = precio_QT;
    }

    public double calcular_costo() {
        // Implementar la lógica para calcular el costo de la ruta Quito-Tulcán
        // teniendo en cuenta el precio_QT
        return 0.0;
    }
}

public class Servicio {
    private double precio;

    public Servicio(double precio) {
        this.precio = precio;
    }

    public double costo_servicio() {
        // Implementar la lógica para calcular el costo del servicio
        // teniendo en cuenta el precio
        return 0.0;
    }
}

public class Quito_Puyo {
    private String Ciudad_destino;
    private double precio_QP;

    public Quito_Puyo(String Ciudad_destino, double precio_QP) {
        this.Ciudad_destino = Ciudad_destino;
        this.precio_QP = precio_QP;
    }

    public double calcular_costo() {
        // Implementar la lógica para calcular el costo de la ruta Quito-Puyo
        // teniendo en cuenta el precio_QP
        return 0.0;
    }
}

public class Quito_Riobamba {
    private double precio_QR;

    public Quito_Riobamba(double precio_QR) {
        this.precio_QR = precio_QR;
    }

    public double calcular_costo() {
        // Implementar la lógica para calcular el costo de la ruta Quito-Riobamba
        // teniendo en cuenta el precio_QR
        return 0.0;
    }
}

public class Normal {
    private int num_asiento;
    private int num_maletas;

    public Normal(int num_asiento, int num_maletas) {
        this.num_asiento = num_asiento;
        this.num_maletas = num_maletas;
    }

    public double costo_servicio() {
        // Implementar la lógica para calcular el costo del servicio normal
        // teniendo en cuenta num_asiento y num_maletas
        return 0.0;
    }
}

public class Vip {
    private boolean Television;
    private boolean internet;
    private boolean peliculas;
    private boolean musica;

    public Vip(boolean Television, boolean internet, boolean peliculas, boolean musica) {
        this.Television = Television;
        this.internet = internet;
        this.peliculas = peliculas;
        this.musica = musica;
    }

    public double costo_servicio() {
        // Implementar la lógica para calcular el costo del servicio VIP
        // teniendo en cuenta Television, internet, peliculas y musica
        return 0.0;
    }
}
