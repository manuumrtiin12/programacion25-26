package main.java.Unidad2.AABoletinExcepciones2.Ejercicio3.Modelo;

import main.java.Unidad2.AABoletinExcepciones2.Ejercicio3.Exception.SensorException;

import java.time.LocalDateTime;
import java.util.Arrays;

public class Sensor {

    private static int contador = 0;

    private int id;
    private TipoParametro tipoParametro;
    private double max;
    private double min;
    private Lectura[] historial;

    public Sensor(TipoParametro tipoParametro, double max, double min) {

        contador++;
        this.id = contador;
        this.tipoParametro = tipoParametro;
        this.max = max;
        this.min = min;
        this.historial = new Lectura[100];
    }

    public void registrarLectura(LocalDateTime horaYFecha, double cantidadLeida) throws SensorException {

        boolean anomala = false;

        if (cantidadLeida > max || cantidadLeida < min) {
            anomala = true;
        }

        for (int i = 0; i < historial.length; i++) {

            if (historial[i] == null) {

                if (i > 0) {

                    LocalDateTime ultimaFecha = historial[i - 1].getHoraYFecha();

                    if (horaYFecha.isBefore(ultimaFecha)) {

                        throw new SensorException(
                                "Error en sensor " + id +
                                        " | Fecha nueva: " + horaYFecha +
                                        " | Última fecha: " + ultimaFecha
                        );
                    }
                }

                historial[i] = new Lectura(horaYFecha, cantidadLeida, anomala);
                break;
            }
        }
    }

    public Lectura[] getHistorial() {
        return historial;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Sensor{" +
                "id=" + id +
                ", tipoParametro=" + tipoParametro +
                ", max=" + max +
                ", min=" + min +
                ", historial=" + Arrays.toString(historial) +
                '}';
    }
}