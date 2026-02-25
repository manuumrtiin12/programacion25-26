package main.java.Unidad2.AABoletinClasesAbstractas.Ejercicio3.Modelo;

import java.time.LocalDate;
import java.util.Objects;

public abstract class DispositivoWifi {

    private int id;
    private String mac;
    private EstadoDispositivo estado;
    private LocalDate fechaActualizacion;

    public DispositivoWifi(int id, String mac, EstadoDispositivo estado, LocalDate fechaActualizacion) {
        this.id = id;
        this.mac = mac;
        this.estado = estado;
        this.fechaActualizacion = fechaActualizacion;
    }


    public abstract void conectarInternet();
    public abstract boolean pendienteActualizacion();

    public void apagar() {
        this.estado = EstadoDispositivo.OFF;
        System.out.println("El dispositivo se ha apagado.");
    }

    public int getId() {
        return id;
    }

    public String getMac() {
        return mac;
    }

    public EstadoDispositivo getEstado() {
        return estado;
    }

    public void setEstado(EstadoDispositivo estado) {
        this.estado = estado;
    }

    public LocalDate getFechaActualizacion() {
        return fechaActualizacion;
    }

    public void setFechaActualizacion(LocalDate fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DispositivoWifi)) return false;
        DispositivoWifi that = (DispositivoWifi) o;
        return mac.equals(that.mac);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mac);
    }

    @Override
    public String toString() {
        return "DispositivoWifi{" +
                "id=" + id +
                ", mac='" + mac + '\'' +
                ", estado=" + estado +
                ", fechaActualizacion=" + fechaActualizacion +
                '}';
    }
}