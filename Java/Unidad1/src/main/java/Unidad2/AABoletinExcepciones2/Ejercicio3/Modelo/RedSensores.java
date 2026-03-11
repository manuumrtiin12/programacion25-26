package main.java.Unidad2.AABoletinExcepciones2.Ejercicio3.Modelo;

import main.java.Unidad2.AABoletinExcepciones2.Ejercicio3.Exception.FalloCriticoException;
import main.java.Unidad2.AABoletinExcepciones2.Ejercicio3.Exception.SensorException;

public class RedSensores {

    private Sensor[] sensores;

    public RedSensores() {
        sensores = new Sensor[50];
    }

    public void agregarSensor(Sensor s) {

        for (int i = 0; i < sensores.length; i++) {

            if (sensores[i] == null) {
                sensores[i] = s;
                break;
            }

        }
    }

    public void validarSensores() throws SensorException {

        int sensoresFallidos = 0;
        int totalSensores = 0;

        for (Sensor s : sensores) {

            if (s != null) {

                totalSensores++;

                int anomalas = 0;
                int totalLecturas = 0;

                for (Lectura l : s.getHistorial()) {

                    if (l != null) {

                        totalLecturas++;

                        if (l.isAnomala()) {
                            anomalas++;
                        }

                    }
                }

                if (totalLecturas > 0 && anomalas >= totalLecturas / 3) {

                    sensoresFallidos++;
                    throw new SensorException("Sensor con demasiadas anomalías: " + s.getId());
                }

            }

        }

        if (sensoresFallidos > totalSensores / 2) {

            try {
                throw new FalloCriticoException("FALLO CRÍTICO EN LA RED DE SENSORES");
            } catch (FalloCriticoException e) {
                throw new RuntimeException(e);
            }

        }

    }

}