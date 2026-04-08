package main.java.Unidad2.AASimulacionColecciones.Modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Objects;

public class Evento implements Comparator<Evento> {

    private String nombreEvento;
    private LocalDate fechaEvento;
    private String lugarEvento;
    private ArrayList<Reserva> listaReservas;

    public int compare(Evento e1, Evento e2) {

        int resultado = e1.getFechaEvento().compareTo(e2.getFechaEvento());

        if (resultado == 0) {
            resultado = e1.getNombreEvento().compareTo(e2.getNombreEvento());
        }

        return resultado;
    }

    public Evento(String nombreEvento, LocalDate fechaEvento, String lugarEvento, ArrayList<Reserva> listaReservas) {
        this.nombreEvento = nombreEvento;
        this.fechaEvento = fechaEvento;
        this.lugarEvento = lugarEvento;
        this.listaReservas = listaReservas;
    }

    public String getNombreEvento() {
        return nombreEvento;
    }

    public void setNombreEvento(String nombreEvento) {
        this.nombreEvento = nombreEvento;
    }

    public LocalDate getFechaEvento() {
        return fechaEvento;
    }

    public void setFechaEvento(LocalDate fechaEvento) {
        this.fechaEvento = fechaEvento;
    }

    public String getLugarEvento() {
        return lugarEvento;
    }

    public void setLugarEvento(String lugarEvento) {
        this.lugarEvento = lugarEvento;
    }

    public ArrayList<Reserva> getListaReservas() {
        return listaReservas;
    }

    public void setListaReservas(ArrayList<Reserva> listaReservas) {
        this.listaReservas = listaReservas;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Evento evento = (Evento) o;
        return Objects.equals(nombreEvento, evento.nombreEvento) && Objects.equals(fechaEvento, evento.fechaEvento) && Objects.equals(lugarEvento, evento.lugarEvento) && Objects.equals(listaReservas, evento.listaReservas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombreEvento, fechaEvento, lugarEvento, listaReservas);
    }

    @Override
    public String toString() {
        return "Evento{" +
                "nombreEvento='" + nombreEvento + '\'' +
                ", fechaEvento=" + fechaEvento +
                ", lugarEvento='" + lugarEvento + '\'' +
                ", listaReservas=" + listaReservas +
                '}';
    }
}
