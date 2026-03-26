package main.java.Unidad2.AABoletinMapas.Ejercicio1.Modelo;

import java.time.LocalDate;
import java.util.Objects;

public class entradaVIP {

    private int codigoEntrada;
    private LocalDate fechaEntrada;
    private TipoEntrada tipoEntrada;
    private EstadoEntrada estadoEntrada;

    public entradaVIP(int codigoEntrada, LocalDate fechaEntrada, TipoEntrada tipoEntrada) {
        this.codigoEntrada = codigoEntrada;
        this.fechaEntrada = fechaEntrada;
        this.tipoEntrada = tipoEntrada;
        this.estadoEntrada = EstadoEntrada.ENVIADA;
    }

    public int getCodigoEntrada() {
        return codigoEntrada;
    }

    public void setCodigoEntrada(int codigoEntrada) {
        this.codigoEntrada = codigoEntrada;
    }

    public LocalDate getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(LocalDate fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public TipoEntrada getTipoEntrada() {
        return tipoEntrada;
    }

    public void setTipoEntrada(TipoEntrada tipoEntrada) {
        this.tipoEntrada = tipoEntrada;
    }

    public EstadoEntrada getEstadoEntrada() {
        return estadoEntrada;
    }

    public void setEstadoEntrada(EstadoEntrada estadoEntrada) {
        this.estadoEntrada = estadoEntrada;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        entradaVIP that = (entradaVIP) o;
        return codigoEntrada == that.codigoEntrada && Objects.equals(fechaEntrada, that.fechaEntrada) && tipoEntrada == that.tipoEntrada && estadoEntrada == that.estadoEntrada;
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigoEntrada, fechaEntrada, tipoEntrada, estadoEntrada);
    }

    @Override
    public String toString() {
        return "entradaVIP{" +
                "codigoEntrada=" + getCodigoEntrada() +
                ", fechaEntrada=" + getFechaEntrada() +
                ", tipoEntrada=" + getTipoEntrada() +
                ", estadoEntrada=" + getEstadoEntrada() +
                '}';
    }
}
