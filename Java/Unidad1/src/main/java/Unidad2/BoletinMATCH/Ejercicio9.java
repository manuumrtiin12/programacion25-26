package Unidad2.BoletinMATCH;

import java.util.Scanner;

public class Ejercicio9 {
    static void main(String[] args) {

        Scanner escaner = new Scanner(System.in);
        System.out.println("==================================");
        System.out.println("Introduce + si quieres sumar      ");
        System.out.println("Introduce - si quieres restar     ");
        System.out.println("Introduce * si quieres multiplicar");
        System.out.println("Introduce / si quieres dividir");
        System.out.println("Introduce @ si quieres salir");
        System.out.println("==================================");

        System.out.print("Dame un numero: ");
        int numero1 = escaner.nextInt();

        System.out.print("Dame otro numero: ");
        int numero2 = escaner.nextInt();

        System.out.print("Que quieres hacer con estos numeros: ");
        String eleccion = escaner.next();

        int resultado = 0;
        double resultadoDivision = 0;

        while (eleccion != "@") {
            switch (eleccion) {
                case "+":
                    resultado = numero1 + numero2;
                    break;

                case "-":
                    resultado = numero1 - numero2;
                    break;

                case "*":
                    resultado = numero1 * numero2;
                    break;

                case "/":
                    resultadoDivision = (double) numero1 / numero2;
                    break;

                case "@":
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Solo puedes usar: [ sumar(+) | restar(-) | multiplicar(*) | dividir(/) ]");
            }

            if (eleccion != "/") {
                System.out.println("El resultado es: " + resultado);

                System.out.println("==================================");
                System.out.println("Introduce + si quieres sumar      ");
                System.out.println("Introduce - si quieres restar     ");
                System.out.println("Introduce * si quieres multiplicar");
                System.out.println("Introduce / si quieres dividir");
                System.out.println("Introduce @ si quieres salir");
                System.out.println("==================================");

                System.out.print("Dame un numero: ");
                 numero1 = escaner.nextInt();

                System.out.print("Dame otro numero: ");
                 numero2 = escaner.nextInt();

                System.out.print("Que quieres hacer con estos numeros: ");
                 eleccion = escaner.next();

            } else {
                System.out.println("El resultado es: " + resultadoDivision);

                System.out.println("==================================");
                System.out.println("Introduce + si quieres sumar      ");
                System.out.println("Introduce - si quieres restar     ");
                System.out.println("Introduce * si quieres multiplicar");
                System.out.println("Introduce / si quieres dividir");
                System.out.println("Introduce @ si quieres salir");
                System.out.println("==================================");

                System.out.print("Dame un numero: ");
                 numero1 = escaner.nextInt();

                System.out.print("Dame otro numero: ");
                 numero2 = escaner.nextInt();

                System.out.print("Que quieres hacer con estos numeros: ");
                 eleccion = escaner.next();
            }
        }
    }
}


