package main.java.Unidad2.AABoletinExcepciones2.Ejercicio3.Modelo;

import main.java.Unidad2.AABoletinExcepciones2.Ejercicio3.Exception.FalloCriticoException;
import main.java.Unidad2.AABoletinExcepciones2.Ejercicio3.Exception.SensorException;

public class RedSensores {

    private Sensor[] sensores;
    private static int numeroSensores;

    public RedSensores() {
        sensores = new Sensor[50];
    }

    private int cuentaNumeroSensoresFallidos(Sensor s) {

        int anomalas = 0;

        for (Lectura l : s.getHistorial()) {

            if (l != null) {

                if (l.isAnomala()) {
                    anomalas++;
                }

            }
        }

        return anomalas;
    }

    public void agregarSensor(Sensor s) {

        sensores[numeroSensores] = s;
        numeroSensores++;

    }

    public void validarSensores() throws FalloCriticoException, SensorException {

        int sensoresFallidos = 0;
        int totalSensores = 0;

        for (Sensor s : sensores) {

            try {


            if (s != null) {

                int numeroAnomalas = cuentaNumeroSensoresFallidos(s);
                totalSensores++;

                if (s.getContadorLectura() / 3 < numeroAnomalas) {

                    sensoresFallidos++;
                    throw new SensorException("Sensor con demasiadas anomalías: " + s.getId());
                }
            }

            }catch (SensorException e) {

                throw e;
            }
        }

        if (sensoresFallidos > totalSensores / 2) {

            throw new FalloCriticoException("FALLO CRÍTICO EN LA RED DE SENSORES");
        }
    }
}