package main.java.Unidad2.boletinExpresionesRegulares;

import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una frase:");
        String frase = sc.nextLine();

        String soloVocales = frase.replaceAll("[^aeiouAEIOUáéíóúÁÉÍÓÚ]", "");

        int numVocales = soloVocales.length();

        System.out.println("Número de vocales: " + numVocales);
    }
}
