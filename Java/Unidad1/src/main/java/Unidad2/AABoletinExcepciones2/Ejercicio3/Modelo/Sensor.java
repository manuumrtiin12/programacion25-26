package main.java.Unidad2.AABoletinExcepciones2.Ejercicio3.Modelo;

import main.java.Unidad2.AABoletinExcepciones2.Ejercicio3.Exception.SensorException;

import java.time.LocalDateTime;
import java.util.Arrays;

public class Sensor {

    private static int contador = 0;
    private int contadorLectura = 0;

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

        if (!validFechaYHora(horaYFecha)) {
            throw new SensorException("Detectada una lectura con fecha y hora anterior a la ultima detectada");
        }

        if (cantidadLeida > max || cantidadLeida < min) {
            anomala = true;
        }

                historial[contadorLectura] = new Lectura(horaYFecha, cantidadLeida, anomala);
                contadorLectura++;
    }

    private boolean validFechaYHora(LocalDateTime horaYFecha) {

        boolean valido = false;


        if (contadorLectura == 0 || historial[contadorLectura] != null && historial[contadorLectura].getHoraYFecha() != null && historial[contadorLectura].getHoraYFecha().isAfter(horaYFecha)) {
            valido = true;
        }

        return valido;
    }

    public Lectura[] getHistorial() {
        return historial;
    }

    public int getId() {
        return id;
    }

    public int getContadorLectura() {
        return contadorLectura;
    }

    public void setContadorLectura(int contadorLectura) {
        this.contadorLectura = contadorLectura;
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