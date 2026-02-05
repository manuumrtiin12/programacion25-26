package Unidad2.AABoletinEnumerados.Ejercicio2;

public class Ejercicio2Ruta {

    String direccionOrigen;
    String direccionDestino;
    double pesoPaquete;
    Ejercicio2EstadoPaquete estadoPaquete;

    // Constructor
    public Ejercicio2Ruta(String direccionOrigen, String direccionDestino, double pesoPaquete) {
        this.direccionOrigen = direccionOrigen;
        this.direccionDestino = direccionDestino;
        this.pesoPaquete = pesoPaquete;
        this.estadoPaquete = Ejercicio2EstadoPaquete.EN_PREPARACION;
    }

    @Override
    public String toString() {
        return "Ruta{" +
                "origen='" + direccionOrigen + '\'' +
                ", destino='" + direccionDestino + '\'' +
                ", peso=" + pesoPaquete +
                ", estado=" + estadoPaquete +
                '}';
    }
}

