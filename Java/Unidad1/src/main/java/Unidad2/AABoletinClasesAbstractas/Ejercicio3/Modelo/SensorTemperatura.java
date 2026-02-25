package main.java.Unidad2.AABoletinClasesAbstractas.Ejercicio3.Modelo;

import java.time.LocalDate;

public class SensorTemperatura extends DispositivoWifi {

    private double temperatura;

    public SensorTemperatura(int id, String mac, EstadoDispositivo estado,
                             LocalDate fechaActualizacion, double temperatura) {
        super(id, mac, estado, fechaActualizacion);
        this.temperatura = temperatura;
    }

    @Override
    public void conectarInternet() {
        if (getEstado() == EstadoDispositivo.ON_SINWIFI) {
            setEstado(EstadoDispositivo.ON_CONECTADO);
            System.out.println("Sensor conectado mediante WPA");
        }
    }

    @Override
    public boolean pendienteActualizacion() {
        LocalDate fechaLimite = LocalDate.now().minusMonths(3);
        return getFechaActualizacion().isBefore(fechaLimite);
    }

    @Override
    public String toString() {
        return super.toString() + " SensorTemperatura{" +
                "temperatura=" + temperatura +
                '}';
    }
}