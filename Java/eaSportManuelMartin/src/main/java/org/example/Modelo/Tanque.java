package org.example.Modelo;

public class Tanque extends PersonajeJugable{

    private double capacidadEscudo;

    @Override
    public Rangos getRangoCompetitivo() {
        return Rangos.RANGO_TITAN;
    }

    public Tanque(String idAlias, int nivelMaestria, double capacidadEscudo) {
        super(idAlias, nivelMaestria);
        this.capacidadEscudo = capacidadEscudo;
    }

    public double getCapacidadEscudo() {
        return capacidadEscudo;
    }

    public void setCapacidadEscudo(double capacidadEscudo) {
        this.capacidadEscudo = capacidadEscudo;
    }

    @Override
    public String toString() {
        return "Tanque{" +
                "capacidadEscudo=" + getCapacidadEscudo() +
                ", idAlias='" + getIdAlias() + '\'' +
                ", nivelMaestria=" + getNivelMaestria() +
                ", fechaDesbloqueo=" + getFechaDesbloqueo() +
                '}';
    }
}
