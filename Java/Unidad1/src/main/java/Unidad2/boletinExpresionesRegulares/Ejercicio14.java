package main.java.Unidad2.boletinExpresionesRegulares;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Ejercicio14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una cadena:");
        String cadena = sc.nextLine();

        // Regex: solo letras y números
        String regex = "^[A-Za-z0-9]+$";

        if (Pattern.matches(regex, cadena)) {
            System.out.println("La cadena es válida (solo letras y números).");
        } else {
            System.out.println("La cadena NO es válida (contiene otros caracteres).");
        }
    }
}
