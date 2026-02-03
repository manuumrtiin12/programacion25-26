package main.java.Unidad2.AAOrientacionObjetoItroduccion2;

public class Ejercicio2Partida {

    String nombreJuego;
    int participantes;
    String ganador;

    public Ejercicio2Partida(String nombreJuego, int participantes) {
        this.nombreJuego = nombreJuego;
        this.participantes = participantes;
        this.ganador = null;
    }

    @Override
    public String toString() {
        return "Ejercicio2Partida{" +
                "nombreJuego='" + nombreJuego + '\'' +
                ", participantes=" + participantes +
                ", ganador='" + ganador + '\'' +
                '}';
    }

    public void buscarGanador(Ejercicio2Participante[] jugadores) {
        if (jugadores == null || jugadores.length == 0) {
            ganador = null;
            return;
        }

        Ejercicio2Participante max = jugadores[0];
        for (int i = 1; i < jugadores.length; i++) {
            if (jugadores[i].puntuacion > max.puntuacion) {
                max = jugadores[i];
            }
        }

        ganador = max.nick;
    }
}
