package main.java.Unidad2.BoletinMATCH;

import java.util.Scanner;

public class Ejercicio8 {
    static void main(String[] args) {

        Scanner escaner = new Scanner(System.in);

        System.out.print("Dame un numero: ");
        int numero1 = escaner.nextInt();

        System.out.print("Dame otrp numero: ");
        int numero2 = escaner.nextInt();

        System.out.print("Que quieres hacer con estos numeros [ sumar(+) | restar(-) | multiplicar(*) | dividir(/) ]: ");
        String eleccion = escaner.next();

        int resultado = 0;
        double resultadoDivision = 0;

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

            default:
                System.out.println("Solo puedes usar: [ sumar(+) | restar(-) | multiplicar(*) | dividir(/) ]");
        }

        if (eleccion != "/") {
            System.out.println("El resultado es: " + resultado);

        } else {
            System.out.println("El resultado es: " + resultadoDivision);

        }
    }
}
