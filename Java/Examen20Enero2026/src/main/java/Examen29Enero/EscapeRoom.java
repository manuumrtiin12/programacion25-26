package Examen29Enero;

import java.util.Random;
import java.util.Scanner;

public class EscapeRoom {

    public void menu() {
        System.out.println("==========================");
        System.out.println("1. Generar Partida");
        System.out.println("2. Intentar Abrir una Sala");
        System.out.println("3. Estado del Escape Room");
        System.out.println("4. Salir");
        System.out.println("==========================");
    }

    public void generaPartida(int[] numeroSalas, String[] estadoSalas, Random r) {

        numeroSalas[0] = 0;
        numeroSalas[1] = 3;
        numeroSalas[2] = 4;
        numeroSalas[3] = 2;
        numeroSalas[4] = 1;

        for (int i= 0 ; i < numeroSalas.length ; i++) {
            estadoSalas[i] = "BLOQUEADA";
        }
    }

    public void estadoEscapeRoom( int numSalasAbiertas, int numSalasBloqueadas, int numSalasInvalidas, String[] estadoSalas) {

        System.out.println("Salas abiertas: " + numSalasAbiertas);
        System.out.println("Salas bloqueadas: " + numSalasBloqueadas);
        System.out.println("Salas invalidas: " + numSalasInvalidas);

        for (int i = 0 ; i < estadoSalas.length ; i++) {
            System.out.println("Sala" + i + ": " + estadoSalas[i]);
        }
    }

    public void abrirSalas(String[] estadoSalas, int[] numeroSalas, int numSalasAbiertas, int numSalasBloqueadas, int numSalasInvalidas, Scanner sc) {

        System.out.println("Que numero de sala quieres probar? [0 - 4]: ");
        int eleccionSala = sc.nextInt();

        while(eleccionSala < 0 || eleccionSala > 4) {
            System.out.println("Eleccion invalida...");
            System.out.println("Que numero de sala quieres probar? [0 - 4]: ");
            eleccionSala = sc.nextInt();
        }

        if (estadoSalas[eleccionSala].equals("DESBLOQUEADA")) {
            System.out.println("La sala " + eleccionSala + " ya esta desbloqueada");
        }

        else if (estadoSalas[eleccionSala].equals("INVALIDA")) {
            System.out.println("La sala " + eleccionSala + " esta en estado invalida y no puedes completar el juego");
        }

        else if (estadoSalas[eleccionSala].equals("BLOQUEADA")) {

            int contadorIntentos = 0;

            System.out.println("Dame un numero [0 - 6]: ");
            int intento = sc.nextInt();

            while (intento != numeroSalas[eleccionSala] ||contadorIntentos != 3) {

                while(intento < 0 || intento > 6) {
                    System.out.println("Eleccion fuera de rango...");
                    System.out.println("Dame un numero [0 - 6]: ");
                    intento = sc.nextInt();
                }

                if (intento != numeroSalas[eleccionSala]) {
                    System.out.println("Codigo incorrecto, prueba otra vez...");
                    contadorIntentos++;
                }

                if (intento == numeroSalas[eleccionSala]) {
                    System.out.println("Codigo correcto, la sala " + eleccionSala + " a sido desbloqueada");
                    estadoSalas[eleccionSala].replace("BLOQUEADA","DESBLOQUEADA");
                    numSalasAbiertas++;
                    numSalasBloqueadas--;
                    contadorIntentos = 0;
                }

                System.out.println("Dame un numero [0 - 6]: ");
                intento = sc.nextInt();
            }
        }
    }

    public void main(String[] args) {

        EscapeRoom e = new EscapeRoom();

        int[] numeroSalas = new int[5];
        String[] estadoSalas = new String[5];

        Random r = new Random();

        Scanner sc = new Scanner(System.in);

        int numSalasAbiertas = 0;
        int numSalasBloqueadas = 5;
        int numSalasInvalidas = 0;

        e.menu();
        System.out.print("¿Que quieres hacer?: ");
        int eleccionMenu = sc.nextInt();

        while (eleccionMenu != 4) {
            if (eleccionMenu == 1) {
                e.generaPartida(numeroSalas, estadoSalas, r);
                System.out.println("Sala generada correctamente");

                for (int n : numeroSalas) {
                    System.out.println(numeroSalas[n]);
                }
            }

            else if (eleccionMenu == 2) {
                abrirSalas(estadoSalas, numeroSalas, numSalasAbiertas, numSalasBloqueadas, numSalasInvalidas, sc);
            }

            else if (eleccionMenu == 3) {
                estadoEscapeRoom(numSalasAbiertas, numSalasBloqueadas, numSalasInvalidas, estadoSalas);
            }

            else {System.out.println("Opcion no valida...");}

            e.menu();
            System.out.print("¿Que quieres hacer?: ");
            eleccionMenu = sc.nextInt();

        }
        System.out.println("Saliendo...");

    }
}

