package main.java.Unidad2.AAOrientacionObjetoItroduccion2;

public class Ejercicio2GestionaTorneo {

    public static void main(String[] args) {

        // Crear participantes para Catán
        Ejercicio2Participante p1 = new Ejercicio2Participante("Dragon", "Luis", 20, 50);
        Ejercicio2Participante p2 = new Ejercicio2Participante("Tiger", "Ana", 22, 70);
        Ejercicio2Participante p3 = new Ejercicio2Participante("Eagle", "Mario", 19, 65);
        Ejercicio2Participante p4 = new Ejercicio2Participante("Shark", "Laura", 21, 60);
        Ejercicio2Participante[] jugadoresCatan = {p1, p2, p3, p4};

        // Crear partida Catán
        Ejercicio2Partida partida1 = new Ejercicio2Partida("Catán", jugadoresCatan.length);
        partida1.buscarGanador(jugadoresCatan);

        // Crear participantes para Monopoly
        Ejercicio2Participante p5 = new Ejercicio2Participante("Lion", "Carlos", 23, 80);
        Ejercicio2Participante p6 = new Ejercicio2Participante("Wolf", "Sofía", 21, 75);
        Ejercicio2Participante p7 = new Ejercicio2Participante("Fox", "Javier", 20, 65);
        Ejercicio2Participante p8 = new Ejercicio2Participante("Bear", "Elena", 22, 70);
        Ejercicio2Participante[] jugadoresMonopoly = {p5, p6, p7, p8};

        // Crear partida Monopoly
        Ejercicio2Partida partida2 = new Ejercicio2Partida("Monopoly", jugadoresMonopoly.length);
        partida2.buscarGanador(jugadoresMonopoly);

        // Crear participantes para Risk
        Ejercicio2Participante p9 = new Ejercicio2Participante("Hawk", "Pedro", 25, 60);
        Ejercicio2Participante p10 = new Ejercicio2Participante("Tiger", "Lucía", 24, 85);
        Ejercicio2Participante p11 = new Ejercicio2Participante("Eagle", "Marta", 23, 90);
        Ejercicio2Participante p12 = new Ejercicio2Participante("Shark", "Diego", 26, 80);
        Ejercicio2Participante[] jugadoresRisk = {p9, p10, p11, p12};

        // Crear partida Risk
        Ejercicio2Partida partida3 = new Ejercicio2Partida("Risk", jugadoresRisk.length);
        partida3.buscarGanador(jugadoresRisk);

        // Mostrar resultados
        System.out.println("Ganador de " + partida1.nombreJuego + ": " + partida1.ganador);
        System.out.println("Ganador de " + partida2.nombreJuego + ": " + partida2.ganador);
        System.out.println("Ganador de " + partida3.nombreJuego + ": " + partida3.ganador);
    }
}
