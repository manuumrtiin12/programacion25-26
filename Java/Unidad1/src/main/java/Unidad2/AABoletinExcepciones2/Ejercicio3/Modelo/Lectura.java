package main.java.Unidad2.AABoletinExcepciones2.Ejercicio3.Modelo;

import java.time.LocalDateTime;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Lectura lectura = (Lectura) o;
        return Double.compare(cantidadLeida, lectura.cantidadLeida) == 0 && Objects.equals(horaYFecha, lectura.horaYFecha);
    }

    @Override
    public int hashCode() {
        return Objects.hash(horaYFecha, cantidadLeida);
    }

    @Override
    public String toString() {
        return "Lectura{" +
                "horaYFecha=" + getHoraYFecha() +
                ", cantidadLeida=" + getCantidadLeida() +
                ", anomala=" + isAnomala() +
                '}';
    }
}

