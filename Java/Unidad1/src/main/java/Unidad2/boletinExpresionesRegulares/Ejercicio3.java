package Unidad2.boletinExpresionesRegulares;

public class Ejercicio3 {
    public static void main(String[] args) {
        String frase = "ddddd";
        String patron = "[a-z]{5}";

        if (frase.matches(patron)) {
            System.out.println("Válido");
        } else {
            System.out.println("No coincide");
        }
    }
}
