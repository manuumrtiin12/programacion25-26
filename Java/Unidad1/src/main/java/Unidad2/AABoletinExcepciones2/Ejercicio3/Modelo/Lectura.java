package main.java.Unidad2.AABoletinExcepciones2.Ejercicio3.Modelo;

import java.time.LocalDateTime;

public class Lectura {

    private LocalDateTime horaYFecha;
    private double cantidadLeida;
    private boolean anomala;

    public Lectura(LocalDateTime horaYFecha, double cantidadLeida, boolean anomala) {
        this.horaYFecha = horaYFecha;
        this.cantidadLeida = cantidadLeida;
        this.anomala = anomala;
    }

    public LocalDateTime getHoraYFecha() {
        return horaYFecha;
    }

    public double getCantidadLeida() {
        return cantidadLeida;
    }

    public boolean isAnomala() {
        return anomala;
    }
}

