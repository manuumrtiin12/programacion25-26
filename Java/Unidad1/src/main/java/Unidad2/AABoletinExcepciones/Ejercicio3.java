package main.java.Unidad2.AABoletinExcepciones;

import java.util.Scanner;

public class Ejercicio3 {

    public static void leerNumeros() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Cuántos números vas a ingresar? ");
        int cantidad = scanner.nextInt();

        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingresa el número " + (i + 1) + ": ");
            int numero = scanner.nextInt();

            if (numero > 0) {
                throw new ArithmeticException("Se ingresó un número positivo: " + numero);
            }
        }

        System.out.println("Todos los números son cero o negativos.");
    }

    public static void main(String[] args) {
        try {
            leerNumeros();
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}