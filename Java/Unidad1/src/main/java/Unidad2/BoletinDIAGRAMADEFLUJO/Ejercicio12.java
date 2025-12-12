package Unidad2.BoletinDIAGRAMADEFLUJO;

import java.util.Scanner;

public class Ejercicio12 {
    static void main(String[] args) {

        Scanner escaner = new Scanner(System.in);

        System.out.print("Dame tu contraseña: ");
        int contraseña = escaner.nextInt();


        while (contraseña != 1234 ) {
            System.out.println("Contraseña incorrecta, intetalo de nuevo...");
            System.out.print("Dame tu contraseña: ");
            contraseña = escaner.nextInt();

        }

        System.out.print("Bienvenido...");
    }
}
