package main.java.Unidad2.AABoletinClasesAbstractas.Ejercicio3.Modelo;

import java.time.LocalDate;

public class PuertaAutomatica extends DispositivoWifi {

    public PuertaAutomatica(int id, String mac, EstadoDispositivo estado,
                            LocalDate fechaActualizacion) {
        super(id, mac, estado, fechaActualizacion);
    }

    @Override
    public void conectarInternet() {
        if (getEstado() == EstadoDispositivo.ON_SINWIFI) {
            setEstado(EstadoDispositivo.ON_CONECTADO);
            System.out.println("Puerta conectada mediante WPA2");
        }
    }

    @Override
    public boolean pendienteActualizacion() {
        LocalDate fechaLimite = LocalDate.now().minusMonths(1);
        return getFechaActualizacion().isBefore(fechaLimite);
    }

    @Override
    public String toString() {
        return super.toString() + " PuertaAutomatica{}";
    }
}