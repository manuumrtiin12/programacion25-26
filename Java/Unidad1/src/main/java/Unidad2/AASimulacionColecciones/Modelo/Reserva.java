package main.java.Unidad2.AASimulacionColecciones.Modelo;

import java.time.LocalDate;
import java.util.Objects;

public class Reserva {

    private int idReserva;
    private LocalDate fechaReserva;
    private EstadoReserva estadoReserva;
    private Usuario usuarioReserva;

    public Reserva(int idReserva, LocalDate fechaReserva, EstadoReserva estadoReserva, Usuario usuarioReserva) {
        this.idReserva = idReserva;
        this.fechaReserva = fechaReserva;
        this.estadoReserva = estadoReserva;
        this.usuarioReserva = usuarioReserva;
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public LocalDate getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(LocalDate fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public EstadoReserva getEstadoReserva() {
        return estadoReserva;
    }

    public void setEstadoReserva(EstadoReserva estadoReserva) {
        this.estadoReserva = estadoReserva;
    }

    public Usuario getUsuarioReserva() {
        return usuarioReserva;
    }

    public void setUsuarioReserva(Usuario usuarioReserva) {
        this.usuarioReserva = usuarioReserva;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Reserva reserva = (Reserva) o;
        return idReserva == reserva.idReserva;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(idReserva);
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "idReserva=" + idReserva +
                ", fechaReserva=" + fechaReserva +
                ", estadoReserva=" + estadoReserva +
                ", usuarioReserva=" + usuarioReserva +
                '}';
    }
}
