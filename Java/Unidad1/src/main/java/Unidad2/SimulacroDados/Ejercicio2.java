package main.java.Unidad2.SimulacroDados;

import java.util.Scanner;

public class Ejercicio2 {

    public boolean esValido(String numero) {
        int puntos = 0;

        for (int i = 0; i < numero.length(); i++) {
            char c = numero.charAt(i);

            if (c == '.') {
                puntos++;
                if (puntos > 1) {
                    return false;
                }
            }
        }
        return true;
    }

    public String redondear(String numero) {

        if (!esValido(numero)) {
            return "Número no válido";
        }

        if (!numero.contains(".")) {
            return numero + ".00";
        }

        String[] partes = numero.split(".");
        String parteEntera = partes[0];
        String parteDecimal = partes[1];

        while (parteDecimal.length() < 3) {
            parteDecimal += "0";
        }

        int d1 = parteDecimal.charAt(0) - '0';
        int d2 = parteDecimal.charAt(1) - '0';
        int d3 = parteDecimal.charAt(2) - '0';

        if (d3 >= 5) {
            d2 += 1;
            if (d2 == 10) {
                d2 = 0;
                d1 += 1;
                if (d1 == 10) {
                    d1 = 0;
                    parteEntera = String.valueOf(Integer.parseInt(parteEntera) + 1);
                }
            }
        }

        return parteEntera + "." + d1 + d2;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ejercicio2 r = new Ejercicio2();

        System.out.print("Dame un numero: ");
        String entrada = sc.next();

        System.out.println("¿Es válido? " + r.esValido(entrada));
        System.out.println("Redondeado: " + r.redondear(entrada));
        System.out.println();

        String[] pruebas = {
                "123",
                "45.67",
                "0.5",
                ".25",
                "10.",
                "3..4",
                "12a.3",
                "4,5",
                "9.999",
                "3.456"
        };

        System.out.println("=== Resultados de pruebas ===");
        for (String n : pruebas) {
            System.out.println("Número: \"" + n + "\" -> válido: " + r.esValido(n) +
                    " | redondeado: " + r.redondear(n));
        }
    }
}