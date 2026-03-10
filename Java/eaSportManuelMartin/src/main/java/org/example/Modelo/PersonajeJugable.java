package org.example.Modelo;

import java.time.LocalDateTime;
import java.util.Objects;

public abstract class PersonajeJugable implements IAnalizable{

    private String idAlias;
    private int nivelMaestria;
    private LocalDateTime fechaDesbloqueo;

    public abstract Rangos getRangoCompetitivo();

    public String generarMetrica() {
        return "Alias: " + this.idAlias + " Fecha de desbloqueo: " + this.fechaDesbloqueo;
    }

    public PersonajeJugable(String idAlias, int nivelMaestria) {
        this.idAlias = idAlias;

        if (nivelMaestria < 0) {
            this.nivelMaestria = 1;
        }

        else if (nivelMaestria > 100) {
            this.nivelMaestria = 100;
        }

        this.fechaDesbloqueo = LocalDateTime.now();
    }

    public String getIdAlias() {
        return idAlias;
    }

    public void setIdAlias(String idAlias) {
        this.idAlias = idAlias;
    }

    public int getNivelMaestria() {
        return nivelMaestria;
    }

    public void setNivelMaestria(int nivelMaestria) {
        this.nivelMaestria = nivelMaestria;
    }

    public LocalDateTime getFechaDesbloqueo() {
        return fechaDesbloqueo;
    }

    public void setFechaDesbloqueo(LocalDateTime fechaDesbloqueo) {
        this.fechaDesbloqueo = fechaDesbloqueo;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        PersonajeJugable that = (PersonajeJugable) o;
        return Objects.equals(idAlias, that.idAlias);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(idAlias);
    }

    @Override
    public String toString() {
        return "PersonajeJugable{" +
                "idAlias='" + getIdAlias() + '\'' +
                ", nivelMaestria=" + getNivelMaestria() +
                ", fechaDesbloqueo=" + getFechaDesbloqueo() +
                '}';
    }
}
