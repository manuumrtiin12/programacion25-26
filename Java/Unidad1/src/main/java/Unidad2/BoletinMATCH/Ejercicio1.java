package Unidad2.BoletinMATCH;

import java.util.Scanner;

public class Ejercicio1 {
    static void main(String[] args) {

        Scanner escaner = new Scanner(System.in);

        System.out.print("Dame un numero para verlo escrito: ");
        int numero = escaner.nextInt();

        switch (numero) {
            case 0:
                System.out.println("cero");
                break;

            case 1:
                System.out.println("uno");
                break;

            case 2:
                System.out.println("dos");
                break;

            default:
                System.out.println("Otros");

        }
    }
}
