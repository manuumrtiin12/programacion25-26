package main.java.Unidad2.boletinExpresionesRegulares;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Ejercicio19 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número de teléfono:");
        String telefono = sc.nextLine();

        String regex = "^[967]\\d{8}$";

        if (Pattern.matches(regex, telefono)) {
            System.out.println("Número de teléfono válido.");
        } else {
            System.out.println("Número de teléfono NO válido.");
        }
    }
}
