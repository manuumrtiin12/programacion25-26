package Unidad2.DungeonsJavaEdition;

import java.util.Random;
import java.util.Scanner;

public class Dungeons {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Cual es tu nombre aventurero?");
        String nombreHeroe = sc.nextLine();


        int heroeHP = 100;
        int heroeMP = 20;

        int monstruoHP = 80;

        System.out.println("Tu vida: " + heroeHP + " Tu energia " + heroeMP);
        System.out.println("Vida del enemigo: " + monstruoHP);

        System.out.println("1. Ataque Basico");
        System.out.println("2. Ataque Especial");
        System.out.println("3. Curacion");

        int eleccionMenu = sc.nextInt();
        System.out.print("Que quieres hacer?: ");

        while (heroeHP > 0 && monstruoHP > 0)
        {
            System.out.println("Tu vida: " + heroeHP + " Tu energia " + heroeMP);
            System.out.println("Vida del enemigo: " + monstruoHP);

            if (eleccionMenu == 1)
            {
                int daño = random.nextInt(7, 12);
                monstruoHP -= daño;

            }

            else if (eleccionMenu == 2)
            {
                if (heroeMP >= 5 )
                {
                    int daño = random.nextInt(12, 25);
                    monstruoHP -= daño;
                    heroeMP -= 5;
                }

                else {
                    System.out.println("No puedes hacer esto...");

                    System.out.println("1. Ataque Basico");
                    System.out.println("2. Ataque Especial");
                    System.out.println("3. Curacion");

                    System.out.print("Cual es tu nombre aventurero?");
                    eleccionMenu = sc.nextInt();
                }
            }

            else {
                if (heroeMP >= 8)
                {
                    int recuperacionDeVida = 20;
                    heroeMP -= 8;
                    heroeHP += 20;
                }

                else {
                    System.out.println("No puedes hacer esto...");

                    System.out.println("1. Ataque Basico");
                    System.out.println("2. Ataque Especial");
                    System.out.println("3. Curacion");

                    System.out.print("Cual es tu nombre aventurero?");
                    eleccionMenu = sc.nextInt();
                }
            }

            System.out.println("1. Ataque Basico");
            System.out.println("2. Ataque Especial");
            System.out.println("3. Curacion");

            System.out.print("Cual es tu nombre aventurero?");
            eleccionMenu = sc.nextInt();
        }

        if (heroeHP == 0 && monstruoHP > 0)
        {
            System.out.println("El monstruo te a derrotado...");
        }

        else {
            System.out.println("Enhorabuena " + nombreHeroe + " Eres el vencedor");
        }
    }
}
