package Unidad2.SimulacionPokemon;

import java.util.Random;
import java.util.Scanner;

public class SimulacionPokemon {

    public void menu() {
        System.out.println("====================");
        System.out.println("[1] Capturar Pokemon");
        System.out.println("[2] Realizar Batalla");
        System.out.println("[3] Mostrar Pokedex ");
        System.out.println("[4] Finalizar       ");
        System.out.println("====================");

    }

    public int capturaPokemon(Scanner sc, String[] nombres, int[] niveles, int contador) {

        if (nombres.length <= 15) {

            sc.nextLine();
            System.out.print("Nombre del Pokemon: ");
            String nombrePokemon = sc.nextLine();
            nombres[contador] = nombrePokemon;


            System.out.print("Nivel del Pokemon: ");
            int nivelPokemon = sc.nextInt();
            niveles[contador] = nivelPokemon;

            System.out.println("Se a añadido el pokemon " + nombrePokemon + " de nivel " + nivelPokemon);

            contador++;
        }

        else {
            System.out.println("Ya tienes 15 pokemons en tu equipo");
        }

        return contador;
    }

    public void muestraPokedex(String[] nombres, int[] niveles, int contador) {
        for(int i = 0 ; i < contador ; i++) {
            System.out.println("Nombre: " + nombres[i] + " Nivel: " + niveles[i]);
        }
    }

    public void realizarBatalla (Scanner sc, String[] nombres, int[] niveles, int contador) {

        Random random = new Random();
        int numeroRandom = random.nextInt(0, contador);

        System.out.println("Que pokemon quieres elegir?: ");
        int eleccion = sc.nextInt();

        System.out.println("Has elegido a: " + nombres[eleccion] + " de nivel " + niveles[eleccion]);

        while (numeroRandom != eleccion) {
            numeroRandom = random.nextInt(0, contador);
        }

        System.out.println("El enemigo ha elegido a " + nombres[numeroRandom] + " de nivel " + niveles[numeroRandom]);

        String resultado = "";

        if (niveles[eleccion] > niveles[numeroRandom]) {
            resultado += ("¡Has ganado!");
        }
        else if (niveles[eleccion] == niveles[numeroRandom]) {
            resultado += ("Empate...");
        }
        else if (niveles[eleccion] < niveles[numeroRandom]) {
            resultado += ("Has perdido...");
        }

        System.out.println("Tu " + nombres[eleccion] + " (Nivel " + niveles[eleccion] + ") "+ " lucho contra "
                + nombres[numeroRandom] + " (Nivel " + ") "+ niveles[numeroRandom]
                + " Resultado: " + resultado);

    }

    public static void main(String[] args) {
        SimulacionPokemon p = new SimulacionPokemon();
        p.menu();

        Scanner sc = new Scanner(System.in);
        System.out.print("Que quieres hacer?: ");
        int opcionMenu = sc.nextInt();

        String[] nombres = new String[15];
        int[] niveles = new int[15];
        int contador = 0;


        while(opcionMenu != 4)
        {
            if (opcionMenu == 1)
            {
                contador = p.capturaPokemon(sc, nombres, niveles, contador);
            }

            else if (opcionMenu == 2)
            {
                p.realizarBatalla(sc, nombres, niveles, contador);
            }

            else if (opcionMenu == 3)
            {
                  p.muestraPokedex(nombres, niveles, contador);
            }

            else
            {
                System.out.println("Opcion no valida, intentalo de nuevo");

            }

            p.menu();
            System.out.print("Que quieres hacer?: ");
            opcionMenu = sc.nextInt();

        }

        System.out.println("Finalizando...");

    }
}