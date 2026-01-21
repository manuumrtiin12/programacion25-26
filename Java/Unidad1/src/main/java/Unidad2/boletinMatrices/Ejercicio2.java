package Unidad2.boletinMatrices;

import java.util.Scanner;

public class Ejercicio2 {

    public int registrarEspectadores(boolean[][] sala, Scanner sc) {

        int numeroEspectadores = 0;

        System.out.print("Fila: ");
        int fila = sc.nextInt();

        while (fila >= 0) {

            System.out.print("Columna: ");
            int columna = sc.nextInt();

            if (fila < sala.length && columna < sala[0].length) {

                if (!sala[fila][columna]) {
                    sala[fila][columna] = true; // Asignar asiento
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

    public int calculaTotalPersonasPorFilas(boolean[][] sala, Scanner sc, int filaBuscar){
        int personasEnFila = 0;

        for (int i = 0 ; i < sala[filaBuscar].length ; i++){
            if (sala[filaBuscar][i]) {
                personasEnFila++;
            }
        }

        return personasEnFila;
    }

    public boolean validarAforo(boolean sala) {
        
    }

    public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ejercicio2 r = new Ejercicio2();

        boolean[][] sala = new boolean[3][4];

        int numeroEspectadores = r.registrarEspectadores(sala, sc);
        System.out.println("El numero de espectadores es: " + numeroEspectadores);

        System.out.print("Dime la fila para conocer cuantas personas hay: ");
        int filaBuscar = sc.nextInt();

        int espectadoresEnFila = r.calculaTotalPersonasPorFilas(sala, sc, filaBuscar);
        System.out.print(espectadoresEnFila);




    }
}
