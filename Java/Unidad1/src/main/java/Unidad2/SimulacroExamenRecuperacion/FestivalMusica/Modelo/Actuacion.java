package main.java.Unidad2.SimulacroExamenRecuperacion.FestivalMusica.Modelo;

import java.time.LocalDateTime;
import java.util.Objects;

public class Actuacion {

    private Artista artistaActuacion;
    private String escenario;
    private LocalDateTime horaInicio;

    public Actuacion(Artista artistaActuacion, String escenario, LocalDateTime horaInicio) {
        this.artistaActuacion = artistaActuacion;
        this.escenario = escenario;
        this.horaInicio = horaInicio;
    }

    public Artista getArtistaActuacion() {
        return artistaActuacion;
    }

    public void setArtistaActuacion(Artista artistaActuacion) {
        this.artistaActuacion = artistaActuacion;
    }

    public String getEscenario() {
        return escenario;
    }

    public void setEscenario(String escenario) {
        this.escenario = escenario;
    }

    public LocalDateTime getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(LocalDateTime horaInicio) {
        this.horaInicio = horaInicio;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Actuacion actuacion = (Actuacion) o;
        return Objects.equals(artistaActuacion, actuacion.artistaActuacion) && Objects.equals(escenario, actuacion.escenario) && Objects.equals(horaInicio, actuacion.horaInicio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(artistaActuacion, escenario, horaInicio);
    }

    @Override
    public String toString() {
        return "Actuacion{" +
                "artistaActuacion=" + artistaActuacion +
                ", escenario='" + escenario + '\'' +
                ", horaInicio=" + horaInicio +
                '}';
    }
}
