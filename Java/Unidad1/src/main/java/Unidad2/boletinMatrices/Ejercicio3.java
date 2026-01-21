package main.java.Unidad2.boletinMatrices;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio3 {

    public void menu(Scanner sc) {

         System.out.println("====== MENÚ MAPA ESTELAR ======");
         System.out.println("1. Identificar Amenazas");
         System.out.println("2. Calcular el Escudo");
         System.out.println("3. Encontrar el Refugio");
         System.out.println("4. Salir");
         System.out.println("===============================");
    }

    public void identificarAmenazas(int [][] mapaEstelar) {

        for (int i = 0 ; i < mapaEstelar.length ; i++) {
            int[] fila = mapaEstelar[i];

            for (int j = 0 ; j < fila.length ; j++) {
                if (fila[j] > 80) {
                    System.out.println("Cuidado, agujero negro detectado en la fila: " + i + " Columna: " + j);
                }
            }
        }
    }

    public static void main(String[] args) {
        Ejercicio3 e = new Ejercicio3();
        Scanner sc = new Scanner(System.in);

        int[][] mapaEstelar = new int[5][5];
        Random r = new Random();

        for (int i = 0; i < mapaEstelar.length; i++) {
            for (int j = 0; j < mapaEstelar[i].length; j++) {
                mapaEstelar[i][j] = r.nextInt(101);
            }
        }

        for (int i = 0; i < mapaEstelar.length; i++) {
            for (int j = 0; j < mapaEstelar[i].length; j++) {
                System.out.print(mapaEstelar[i][j] + "\t");
            }
            System.out.println();
        }

        e.menu(sc);

        System.out.print("Que quieres hacer? ");
        int eleccionMenu = sc.nextInt();

        while (eleccionMenu != 4) {

            if (eleccionMenu == 1) {
                e.identificarAmenazas(mapaEstelar);
            }
            else if (eleccionMenu == 2) {

            }
            else if (eleccionMenu == 3) {

            }

            e.menu(sc);

            System.out.print("Que quieres hacer? ");
            eleccionMenu = sc.nextInt();
        }
    }
}
