package main.java.Unidad2.boletinExpresionesRegulares;

public class Ejercicio8 {
    public void main(String[] args) {
        String[] palabras = {
                "Hola",
                "DAM",
                "Java123",
                "Programación",
                "Hola_Mundo",
                "Test"
        };

        int contador = 0;

        for (int i = 0 ; i < palabras.length ; i++) {
            if (palabras[i].matches("[a-zA-Z]+")) {
                contador++;
            }
        }
        System.out.println("Las palabras que solo contienen letras son: " + contador);
    }
}
