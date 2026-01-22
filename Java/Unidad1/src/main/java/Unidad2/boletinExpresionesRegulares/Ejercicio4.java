package main.java.Unidad2.boletinExpresionesRegulares;

public class Ejercicio4 {
    public static void main(String[] args) {
        String frase = "1234abc";
        String patron = "\\d{4}[a-zA-Z]{3}";

        if (frase.matches(patron)) {
            System.out.println("Válido");
        } else {
            System.out.println("No coincide");
        }
    }
}
