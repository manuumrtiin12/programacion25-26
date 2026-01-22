package main.java.Unidad2.boletinExpresionesRegulares;

import java.util.regex.Pattern;

public class Ejercicio16 {
    public static void main(String[] args) {

        String[] cadenas = {"apple", "piano", "stop", "tap", "hola"};

        String regex = "^.+p.+$";

        for (String c : cadenas) {
            if (Pattern.matches(regex, c)) {
                System.out.println(c + " → Coincide");
            } else {
                System.out.println(c + " → No coincide");
            }
        }
    }
}
