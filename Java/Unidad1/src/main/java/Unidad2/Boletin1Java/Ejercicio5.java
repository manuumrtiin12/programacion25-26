package main.java.Unidad2.Boletin1Java;

import java.util.Scanner;

public class Ejercicio5 {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("---Bienvenido---");

        System.out.print("El cliente es VIP?: ");
        String esVIP = sc.next();

        if (esVIP == "si") {
            System.out.print("Cual a sido el importe de la cuenta?: ");
            int importeCuenta = sc.nextInt();

            if (importeCuenta >= 50) {
                System.out.println("El cliente tiene derecho al descuento");
            }

            else{
                System.out.println("El cliente no tiene derecho al descuento");
            }
        }

        else{
            System.out.print("Cual es la edad del cliente?: ");
            int edad = sc.nextInt();

            if (edad >= 65) {
                System.out.println("El cliente tiene derecho al descuento");
            }

            else{
                System.out.println("El cliente no tiene derecho al descuento");
            }
        }
    }
}
