package Unidad2.JavaRacingTeam;

import Unidad2.SimulacionPokemon.SimulacionPokemon;

import java.util.Scanner;

public class JavaRacingTeam {

    public int menu(Scanner sc) {

        System.out.println("=========================");
        System.out.println("1. Cargar/Reiniciar Datos");
        System.out.println("2. Formatear Nombres");
        System.out.println("3. Ver Estadísticas");
        System.out.println("4. Buscar Piloto");
        System.out.println("5. Generar IDs de Carrera");
        System.out.println("6. Salir");
        System.out.println("=========================");

        System.out.print("Que quieres hacer?: ");
        int eleccionMenu = sc.nextInt();

        return eleccionMenu;

    }

    public int inizializaEscuderia(String[] nombres, Double[] tiempos, Scanner sc) {

        int pilotos = 0;

        System.out.print("Cuantos pilotos quieres registrar?: ");
        int numPilotos = sc.nextInt();

        for (int i = 0 ; i < numPilotos ; i++){
            sc.nextLine();

            System.out.print("Nombre del piloto: ");
            String nombrePiloto = sc.nextLine();
            nombres[i] = nombrePiloto;

            System.out.print("Cual es el mejor tiempo de " + nombrePiloto + ":");
            Double tiempoPiloto = sc.nextDouble();
            tiempos[i] = tiempoPiloto;

            pilotos++;
        }

        System.out.println("Registro Completado...");

        return pilotos;
    }

    public void fortearPilotos(String[] nombres) {

        for (int i = 0; i < nombres.length; i++) {

            if (nombres[i] != null) {

                nombres[i] = nombres[i].trim().toUpperCase();

                if (nombres[i].length() > 10) {
                    nombres[i] = nombres[i].substring(0, 9) + ".";
                }
            }
        }
    }

    public void verEstadisticas(String[] nombres, Double[] tiempos) {
        double tiempoMedio = 0;
        int cuentaTiempos = 0;
        double mejorTiempo = 0;
        String mejorPiloto = "";

        for (int i = 0 ; i < tiempos.length ; i++) {

            if (tiempos[i] != null) {
                tiempoMedio += tiempos[i];
                cuentaTiempos++;

                if (tiempos[i] < mejorTiempo) {
                    mejorTiempo = tiempos[i];
                    mejorPiloto = nombres[i];
                }
            }
        }

        System.out.println("Tiempo medio: " + tiempoMedio/cuentaTiempos);
        System.out.println("Mejor piloto: " + mejorPiloto + " Tiempo: " + mejorTiempo);
    }

    public double buscarPiloto()

    public void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] nombres = new String[100];
        Double[] tiempos = new Double[100];

        int eleccionMenu = menu(sc);

        while (eleccionMenu != 6) {

            if (eleccionMenu == 1) {
                inizializaEscuderia(nombres, tiempos, sc);
            }

            else if (eleccionMenu == 2) {
                fortearPilotos(nombres);

                for (int i = 0 ; i < nombres.length ; i++) {

                    if (nombres[i] != null) {
                        System.out.println(nombres[i]);
                    }
                }
            }

            else if (eleccionMenu == 3) {
                verEstadisticas(nombres, tiempos);
            }

            eleccionMenu = menu(sc);
        }
    }
}
