package main.java.Unidad2.boletinExpresionesRegulares;

public class Ejercicio7 {
    public static void main(String[] args) {
        String[] dnis = {
                "12345678Z",
                "87654321A",
                "1234A",
                "ABCDEFGH",
                "11111111"
        };

        for (int i = 0; i < dnis.length; i++) {
            if (dnis[i].matches("\\d{8}[A-Z]")) {
                System.out.println(dnis[i] + " es válido");
            }
            else{
                System.out.println(dnis[i] + "no es valido");
            }
        }
    }
}
