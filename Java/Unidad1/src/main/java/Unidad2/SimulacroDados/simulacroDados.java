package Unidad2.SimulacroDados;

import java.util.Random;
import java.util.Scanner;

public class simulacroDados {

    public void menu(){
        System.out.println("=====MENU CASINO=====");
        System.out.println("1. Apostar");
        System.out.println("2. Mostrar Historial");
        System.out.println("3. Retirarse");
        System.out.println("=====================");
    }

    public String apostar(
            Scanner sc,
            int[] dinero,
            int[] tuApuesta,
            int[] resultadoApuesta,
            int[] historialApuesta,
            int[] historialDado, int[] historialGanancia,
            int[] contadorJugadas) {

        Random r = new Random();
        int dado = r.nextInt(2, 13);

        System.out.print("¿A qué número quieres apostar?: ");
        int numeroApuesta = sc.nextInt();

        while (numeroApuesta < 2 || numeroApuesta > 12) {
            System.out.println("El dado solo puede sumar entre 2 y 12...");
            System.out.print("¿A qué número quieres apostar?: ");
            numeroApuesta = sc.nextInt();
        }

        System.out.print("¿Cuánto quieres apostar?: ");
        int cantidadApuesta = sc.nextInt();

        while (cantidadApuesta > dinero[0]) {
            System.out.println("No tienes suficiente dinero...");
            System.out.print("¿Cuánto quieres apostar?: ");
            cantidadApuesta = sc.nextInt();
        }

        int ganancia;
        String resultado;

        if (numeroApuesta == dado) {
            ganancia = cantidadApuesta;
            resultado = "ganando " + ganancia + "€";
            dinero[0] += cantidadApuesta * 2;
        } else {
            ganancia = -cantidadApuesta;
            resultado = "perdiendo " + cantidadApuesta + "€";
            dinero[0] -= cantidadApuesta;
        }

        tuApuesta[0] = numeroApuesta;
        resultadoApuesta[0] = ganancia;

        grabaHistorial(
                numeroApuesta,
                dado,
                ganancia,
                historialApuesta,
                historialDado,
                historialGanancia,
                contadorJugadas);

        return "Apostó al valor " + numeroApuesta +
                " y sumó " + dado +
                ", " + resultado;
    }

    public void grabaHistorial(
            int numeroApuesta,
            int dado,
            int ganancia,
            int[] historialApuesta,
            int[] historialDado,
            int[] historialGanancia,
            int[] contadorJugadas) {

        historialApuesta[contadorJugadas[0]] = numeroApuesta;
        historialDado[contadorJugadas[0]] = dado;
        historialGanancia[contadorJugadas[0]] = ganancia;
        contadorJugadas[0]++;
    }

    public void mostrarHistorial(int[] historialApuesta,
                                 int[] historialDado,
                                 int[] historialGanancia,
                                 int[] contadorJugadas) {

        for (int i = 0; i < contadorJugadas[0]; i++) {
            System.out.print("En la " + (i + 1) + "ª jugada apostó al valor "
                    + historialApuesta[i] + " y sumó "
                    + historialDado[i] + ", ");
            if (historialGanancia[i] > 0) {
                System.out.println("ganando " + historialGanancia[i] + "€");
            } else {
                System.out.println("perdiendo " + (-historialGanancia[i]) + "€");
            }
        }
    }

    public static void main(String[] args) {
        simulacroDados r = new simulacroDados();
        Scanner sc = new Scanner(System.in);

        int[] dinero = new int[]{100};
        int[] tuApuesta = new int[1];
        int[] resultadoApuesta = new int[1];

        int[] historialApuesta = new int[100];
        int[] historialDado = new int[100];
        int[] historialGanancia = new int[100];
        int[] contadorJugadas = new int[1];

        r.menu();
        System.out.print("Que quieres hacer?: ");
        int eleccionMenu = sc.nextInt();

        while (eleccionMenu != 3) {

            if (eleccionMenu == 1) {
                String resultado1 = r.apostar(sc,
                        dinero,
                        tuApuesta,
                        resultadoApuesta,
                        historialApuesta,
                        historialDado,
                        historialGanancia,
                        contadorJugadas);
                
                System.out.println(resultado1);
            } else if (eleccionMenu == 2) {
                r.mostrarHistorial(historialApuesta, historialDado, historialGanancia, contadorJugadas);
            }

            r.menu();
            System.out.print("Que quieres hacer?: ");
            eleccionMenu = sc.nextInt();
        }

        System.out.println("Saliendo...");
    }
}
