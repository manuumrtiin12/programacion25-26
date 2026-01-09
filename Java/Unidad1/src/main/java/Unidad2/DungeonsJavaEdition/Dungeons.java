package Unidad2.DungeonsJavaEdition;

import java.util.Random;
import java.util.Scanner;

public class Dungeons {

    static Random random = new Random();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("¿Cuál es tu nombre aventurero? ");
        String nombreHeroe = sc.nextLine();

        int heroeHP = 100;
        int heroeMP = 20;
        int monstruoHP = 80;

        while (heroeHP > 0 && monstruoHP > 0) {

            mostrarEstado(nombreHeroe, heroeHP, heroeMP, monstruoHP);
            mostrarMenu();

            int eleccion = sc.nextInt();
            boolean accionValida = false;

            while (!accionValida) {

                switch (eleccion) {
                    case 1:
                        int dañoBasico = generarDanyo(7, 12);
                        monstruoHP -= dañoBasico;
                        System.out.println("Has atacado al monstruo y le has hecho " + dañoBasico + " de daño.");
                        accionValida = true;
                        break;

                    case 2:
                        if (tieneEnergia(heroeMP, 5)) {
                            int dañoEspecial = generarDanyo(12, 25);
                            monstruoHP -= dañoEspecial;
                            heroeMP -= 5;
                            System.out.println("Has usado un ataque especial e hiciste " + dañoEspecial + " de daño.");
                            accionValida = true;
                        } else {
                            System.out.println("No tienes suficiente energía para el ataque especial.");
                            mostrarMenu();
                            eleccion = sc.nextInt();
                        }
                        break;

                    case 3:
                        if (tieneEnergia(heroeMP, 8)) {
                            heroeHP += 20;
                            heroeMP -= 8;
                            System.out.println("Te has curado 20 puntos de vida.");
                            accionValida = true;
                        } else {
                            System.out.println("No tienes suficiente energía para curarte.");
                            mostrarMenu();
                            eleccion = sc.nextInt();
                        }
                        break;

                    default:
                        System.out.println("Opción no válida.");
                        mostrarMenu();
                        eleccion = sc.nextInt();
                }
            }

            // Turno del monstruo (solo si sigue vivo)
            if (monstruoHP > 0) {
                int ataqueEnemigo = generarDanyo(5, 15);
                heroeHP -= ataqueEnemigo;
                System.out.println("El monstruo te ataca y te hace " + ataqueEnemigo + " de daño.");
            }
        }

        if (heroeHP <= 0) {
            System.out.println("El monstruo te ha derrotado.");
        } else {
            System.out.println("Enhorabuena " + nombreHeroe + ", has vencido al monstruo.");
        }
    }

    // Genera un número aleatorio entre min y max
    public static int generarDanyo(int min, int max) {
        return random.nextInt(max - min + 1) + min;
    }

    // Muestra el estado del combate
    public static void mostrarEstado(String nombre, int hp, int mp, int hpEnemigo) {
        System.out.println("\n------------------------------");
        System.out.println("Héroe: " + nombre);
        System.out.println("Vida: " + hp + " | Energía: " + mp);
        System.out.println("Vida del monstruo: " + hpEnemigo);
        System.out.println("------------------------------");
    }

    // Comprueba si hay energía suficiente
    public static boolean tieneEnergia(int mpActual, int coste) {
        return mpActual >= coste;
    }

    // Muestra el menú de acciones
    public static void mostrarMenu() {
        System.out.println("\n1. Ataque Básico");
        System.out.println("2. Ataque Especial (5 MP)");
        System.out.println("3. Curación (8 MP)");
        System.out.print("¿Qué quieres hacer? ");
    }
}
