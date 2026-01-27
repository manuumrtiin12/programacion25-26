package main.java.Unidad2.JavaRacingTeam;

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
        return sc.nextInt();
    }

    public int inizializaEscuderia(String[] nombres, Double[] tiempos, Scanner sc) {

        int pilotos = 0;

        System.out.print("Cuantos pilotos quieres registrar?: ");
        int numPilotos = sc.nextInt();

        for (int i = 0; i < numPilotos; i++) {
            sc.nextLine();

            System.out.print("Nombre del piloto: ");
            nombres[i] = sc.nextLine();

            System.out.print("Cual es el mejor tiempo de " + nombres[i] + ": ");
            tiempos[i] = sc.nextDouble();

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

        double sumaTiempos = 0;
        int cuentaTiempos = 0;
        double mejorTiempo = 0;
        String mejorPiloto = "";
        boolean primerTiempo = true;

        for (int i = 0; i < tiempos.length; i++) {
            if (tiempos[i] != null) {
                sumaTiempos += tiempos[i];
                cuentaTiempos++;

                if (primerTiempo) {
                    mejorTiempo = tiempos[i];
                    mejorPiloto = nombres[i];
                    primerTiempo = false;
                } else if (tiempos[i] < mejorTiempo) {
                    mejorTiempo = tiempos[i];
                    mejorPiloto = nombres[i];
                }
            }
        }

        if (cuentaTiempos > 0) {
            System.out.println("Tiempo medio: " + (sumaTiempos / cuentaTiempos));
            System.out.println("Mejor piloto: " + mejorPiloto + " Tiempo: " + mejorTiempo);
        } else {
            System.out.println("No hay tiempos registrados.");
        }
    }

    public double buscarPiloto(String[] nombres, Double[] tiempos, Scanner sc) {

        sc.nextLine();
        System.out.print("Dime el nombre de a quien quieres buscar: ");
        String pilotoBuscado = sc.nextLine();

        for (int i = 0; i < nombres.length; i++) {
            if (nombres[i] != null && nombres[i].equalsIgnoreCase(pilotoBuscado)) {
                System.out.println("Su marca es: " + tiempos[i]);
                return tiempos[i];
            }
        }

        System.out.println("Piloto no encontrado.");
        return -1;
    }

    public void generarIDS(String[] nombres) {

        for (int i = 0; i < nombres.length; i++) {
            if (nombres[i] != null) {

                String nombre = nombres[i];
                String prefijo;

                if (nombre.length() >= 3) {
                    prefijo = nombre.substring(0, 3);
                } else {
                    prefijo = nombre;
                }

                String id = prefijo + "-" + i;
                System.out.println("Piloto: " + nombre + " -> ID: " + id);
            }
        }
    }


    public static void main(String[] args) {

        JavaRacingTeam app = new JavaRacingTeam();
        Scanner sc = new Scanner(System.in);

        String[] nombres = new String[100];
        Double[] tiempos = new Double[100];

        int eleccionMenu = app.menu(sc);

        while (eleccionMenu != 6) {

            if (eleccionMenu == 1) {
                app.inizializaEscuderia(nombres, tiempos, sc);
            } else if (eleccionMenu == 2) {
                app.fortearPilotos(nombres);

                for (String nombre : nombres) {
                    if (nombre != null) {
                        System.out.println(nombre);
                    }
                }
            } else if (eleccionMenu == 3) {
                app.verEstadisticas(nombres, tiempos);
            } else if (eleccionMenu == 4) {
                app.buscarPiloto(nombres, tiempos, sc);
            } else if (eleccionMenu == 5) {
                app.generarIDS(nombres);
            }

            eleccionMenu = app.menu(sc);
        }

    }
}
