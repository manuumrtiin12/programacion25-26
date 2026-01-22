package Unidad2.boletinExpresionesRegulares;

public class Ejercicio1 {
    public static void main(String[] args) {
        String frase = "12345678";
        String patron = "\\d+";

        if (frase.matches(patron)) {
            System.out.println("Válido");
        } else {
            System.out.println("No coincide");
        }
    }
}
