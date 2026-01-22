package main.java.Unidad2.boletinExpresionesRegulares;

public class Ejercicio6 {
    public static void main(String[] args) {
        String frase = "hola 2 personas";
        String patron = ".*\\d+.*";

        if (frase.matches(patron)) {
            System.out.println("Válido");
        } else {
            System.out.println("No coincide");
        }
    }
}
