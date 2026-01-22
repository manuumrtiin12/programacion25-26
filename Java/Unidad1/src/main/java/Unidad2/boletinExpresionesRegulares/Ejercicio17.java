package main.java.Unidad2.boletinExpresionesRegulares;

import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una dirección IP:");
        String ip = sc.nextLine();


        String ipSinCeros = ip.replaceAll("\\b0+(?=\\d)", "");

        System.out.println("IP sin ceros a la izquierda: " + ipSinCeros);
    }
}
