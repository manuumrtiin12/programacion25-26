package main.java.Unidad2.boletinExpresionesRegulares;

public class Ejercicio5 {
    public static void main(String[] args) {
        String frase = "DAM para todos";
        String patron = "^DAM.*";

        if (frase.matches(patron)) {
            System.out.println("Válido");
        } else {
            System.out.println("No coincide");
        }
    }
}
