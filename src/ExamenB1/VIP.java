package ExamenB1;

public class VIP extends Servicio {
    boolean television;
    boolean internet;
    boolean peliculas;
    boolean musica;

    public VIP(String nombre_Coop, int num_boletos, double precio, String tipo_servicio, boolean television, boolean internet, boolean peliculas, boolean musica) {
        super(nombre_Coop, num_boletos, precio, tipo_servicio);
        this.television = television;
        this.internet = internet;
        this.peliculas = peliculas;
        this.musica = musica;
    }

    public void setTelevision(boolean television) {
        this.television = television;
    }

    public void setInternet(boolean internet) {
        this.internet = internet;
    }

    public void setPeliculas(boolean peliculas) {
        this.peliculas = peliculas;
    }

    public void setMusica(boolean musica) {
        this.musica = musica;
    }

    public double costo_servicio() {
        double costo = precio + (precio*0.30);
        if (television) {
            costo += 50.0;
        }
        if (internet) {
            costo += 30.0;
        }
        if (peliculas) {
            costo += 20.0;
        }
        if (musica) {
            costo += 10.0;
        }
        return costo;
    }
}


