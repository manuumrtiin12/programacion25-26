package main.java.Unidad2.SimulacroExamenRecuperacion.FestivalMusica.Controlador;

import main.java.Unidad2.SimulacroExamenRecuperacion.FestivalMusica.Modelo.Actuacion;
import main.java.Unidad2.SimulacroExamenRecuperacion.FestivalMusica.Modelo.Artista;
import main.java.Unidad2.SimulacroExamenRecuperacion.FestivalMusica.Repositorio.RespositorioFestival;

import java.time.LocalDateTime;

public class ControladorFestival {

    public static void main(String[] args) {

        RespositorioFestival repo = new RespositorioFestival();

        // ===== ARTISTAS =====
        Artista a1 = new Artista("Quevedo", "Urbano", 50000);
        Artista a2 = new Artista("Aitana", "Pop", 60000);
        Artista a3 = new Artista("Rosalia", "Flamenco/Pop", 80000);

        // ===== ACTUACIONES =====
        Actuacion act1 = new Actuacion(
                a1,
                "Escenario Principal",
                LocalDateTime.of(2026, 6, 20, 22, 0)
        );

        Actuacion act2 = new Actuacion(
                a2,
                "Escenario Secundario",
                LocalDateTime.of(2026, 6, 20, 20, 30)
        );

        Actuacion act3 = new Actuacion(
                a3,
                "Escenario Principal",
                LocalDateTime.of(2026, 6, 20, 23, 30)
        );

        Actuacion act4 = new Actuacion(
                a2,
                "Escenario Principal",
                LocalDateTime.of(2026, 6, 20, 21, 0)
        );

        // ===== INSERTAR EN REPOSITORIO =====
        repo.agregarActuacion(act1);
        repo.agregarActuacion(act2);
        repo.agregarActuacion(act3);
        repo.agregarActuacion(act4);

        // ===== PRUEBAS =====

        System.out.println("=== Actuaciones Escenario Principal ===");
        System.out.println(repo.getActuacionesPorEscenario("Escenario Principal"));

        System.out.println("\n=== Géneros únicos ===");
        System.out.println(repo.getGenerosUnicos());

        System.out.println("\n=== Coste por escenario ===");
        System.out.println(repo.getCostePorEscenario());
    }
}