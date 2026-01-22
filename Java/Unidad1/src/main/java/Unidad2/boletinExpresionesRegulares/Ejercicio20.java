package main.java.Unidad2.boletinExpresionesRegulares;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Ejercicio20 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número de teléfono:");
        String telefono = sc.nextLine();

        String regex = "^(\\+\\d{1,2})?\\s*[967](?:\\d{2,3}-?){2,4}$";

        if (Pattern.matches(regex, telefono)) {
            System.out.println("Número de teléfono válido.");
        } else {
            System.out.println("Número de teléfono NO válido.");
        }
    }
}
