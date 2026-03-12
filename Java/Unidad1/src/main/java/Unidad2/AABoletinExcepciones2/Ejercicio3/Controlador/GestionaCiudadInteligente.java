package main.java.Unidad2.AABoletinExcepciones2.Ejercicio3.Controlador;

import main.java.Unidad2.AABoletinExcepciones2.Ejercicio3.Exception.FalloCriticoException;
import main.java.Unidad2.AABoletinExcepciones2.Ejercicio3.Exception.SensorException;
import main.java.Unidad2.AABoletinExcepciones2.Ejercicio3.Modelo.RedSensores;
import main.java.Unidad2.AABoletinExcepciones2.Ejercicio3.Modelo.Sensor;
import main.java.Unidad2.AABoletinExcepciones2.Ejercicio3.Modelo.TipoParametro;

import java.time.LocalDateTime;

public class GestionaCiudadInteligente {

    public static void main(String[] args) throws FalloCriticoException {

        RedSensores red = new RedSensores();

        Sensor s1 = new Sensor(TipoParametro.TEMPERATURA, 50, -10);
        Sensor s2 = new Sensor(TipoParametro.HUMEDAD_RELATIVA, 80, 10);

        red.agregarSensor(s1);
        red.agregarSensor(s2);

        try {
            s1.registrarLectura(LocalDateTime.now(), 20);


        } catch (SensorException e) {
            System.out.println("ALERTA SENSOR:");
            System.out.println(e.getMessage());
        }

        try {
            s1.registrarLectura(LocalDateTime.now().plusMinutes(1), 60);

        } catch (SensorException e) {
            System.out.println("ALERTA SENSOR:");
            System.out.println(e.getMessage());
        }

        try {
            s2.registrarLectura(LocalDateTime.now(), 40);

        } catch (SensorException e) {
            System.out.println("ALERTA SENSOR: ");
            System.out.println(e.getMessage());
        }

        try {
            s2.registrarLectura(LocalDateTime.now().minusMinutes(5), 30);

        } catch (SensorException e) {
            System.out.println("ALERTA SENSOR:");
            System.out.println(e.getMessage());
        }


        try {

            red.validarSensores();

        } catch (SensorException e) {

            System.out.println("Sensor con problemas:");
            System.out.println(e.getMessage());

        }

    }

}