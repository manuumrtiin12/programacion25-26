package main.java.Unidad2.AABoletinClasesAbstractas.Ejercicio3.Modelo;

import java.time.LocalDate;

public class CamaraSeguridad extends DispositivoWifi {

    public CamaraSeguridad(int id, String mac, EstadoDispositivo estado,
                           LocalDate fechaActualizacion) {
        super(id, mac, estado, fechaActualizacion);
    }

    @Override
    public void conectarInternet() {
        if (getEstado() == EstadoDispositivo.ON_SINWIFI) {
            setEstado(EstadoDispositivo.ON_CONECTADO);
            System.out.println("Cámara conectada mediante WPA3");
        }
    }

    @Override
    public boolean pendienteActualizacion() {
        LocalDate fechaLimite = LocalDate.now().minusWeeks(2);
        return getFechaActualizacion().isBefore(fechaLimite);
    }

    @Override
    public String toString() {
        return super.toString() + " CamaraSeguridad{}";
    }
}