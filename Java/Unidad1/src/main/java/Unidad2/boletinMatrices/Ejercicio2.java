package main.java.Unidad2.boletinMatrices;

import java.util.Scanner;

public class Ejercicio2 {

    public int registrarEspectadores(boolean[][] sala, Scanner sc, int numeroEspectadores) {

        System.out.print("Fila: ");
        int fila = sc.nextInt();

        while (fila >= 0) {

            System.out.print("Columna: ");
            int columna = sc.nextInt();

            if (fila < sala.length && columna < sala[0].length) {

                if (!sala[fila][columna]) {
                    sala[fila][columna] = true;
                    numeroEspectadores++;
                    System.out.println("Asiento ocupado correctamente.");
                } else {
                    System.out.println("Ese asiento ya está ocupado.");
                }

            } else {
                System.out.println("Fila o columna fuera de rango.");
            }

            System.out.print("Fila: ");
            fila = sc.nextInt();
        }

        return numeroEspectadores;
    }

    public int calculaTotalPersonasPorFilas(boolean[][] sala, Scanner sc, int filaBuscar) {
        int personasEnFila = 0;

        if (filaBuscar >= 0 && filaBuscar < sala.length) {
            for (int i = 0; i < sala[filaBuscar].length; i++) {
                if (sala[filaBuscar][i]) {
                    personasEnFila++;
                }
            }
        }

        return personasEnFila;
    }

    public boolean validarAforo(boolean[][] sala, int numeroEspectadores) {

        int totalPersonas = 0;

        for (int i = 0; i < sala.length; i++) {
            for (int j = 0; j < sala[i].length; j++) {
                if (sala[i][j]) {
                    totalPersonas++;
                }
            }
        }

        return totalPersonas == numeroEspectadores;
    }

    public static void main(String[] args) {

        int numeroEspectadores = 0;
        Scanner sc = new Scanner(System.in);
        Ejercicio2 r = new Ejercicio2();

        boolean[][] sala = new boolean[3][4];

        numeroEspectadores = r.registrarEspectadores(sala, sc, numeroEspectadores);
        System.out.println("El numero de espectadores es: " + numeroEspectadores);

        System.out.print("Dime la fila para conocer cuantas personas hay: ");
        int filaBuscar = sc.nextInt();

        int espectadoresEnFila = r.calculaTotalPersonasPorFilas(sala, sc, filaBuscar);
        System.out.println(espectadoresEnFila);

        if (r.validarAforo(sala, numeroEspectadores) == true) {
            System.out.println("Validacion afirmativa");
        }
        else {
            System.out.println("Validacion negativa");
        }
    }
}
