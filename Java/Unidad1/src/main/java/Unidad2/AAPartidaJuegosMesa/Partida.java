package Unidad2.AAPartidaJuegosMesa;

import java.util.Arrays;

public class Partida {

    private String nombreJuego;
    private Participante[] participantes;
    private Participante ganador;

    Participante calculaParticipantesConMasPuntos(Participante[] participantes) {

        int jugadorConMasPuntos = 0;

        for (int i = 0 ; i < participantes.length ; i++) {
            Participante p = this.participantes[i];

            if (p.getPuntuacion() > jugadorConMasPuntos) {
                jugadorConMasPuntos = p.getPuntuacion();
            }
        }

        return participantes[jugadorConMasPuntos];
    }

    public Partida(String nombreJuego, Participante[] participantes, Participante ganador) {
        this.nombreJuego = nombreJuego;
        this.participantes = participantes;
        this.ganador = ganador;
    }

    @Override
    public String toString() {
        return "Partida{" +
                "nombreJuego='" + nombreJuego + '\'' +
                ", participantes=" + Arrays.toString(participantes) +
                ", ganador=" + ganador +
                '}';
    }

    public String getNombreJuego() {
        return nombreJuego;
    }

    public void setNombreJuego(String nombreJuego) {
        this.nombreJuego = nombreJuego;
    }

    public Participante[] getParticipantes() {
        return participantes;
    }

    public void setParticipantes(Participante[] participantes) {
        this.participantes = participantes;
    }

    public Participante getGanador() {
        return ganador;
    }

    public void setGanador(Participante ganador) {
        this.ganador = ganador;
    }
}
