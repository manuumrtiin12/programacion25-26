package main.java.Unidad2.Boletin1Cadenas;

public class Ejercicio6 {
    public static void main(String[] args) {

        int[] tabla1 = {1, 2, 3};
        int[] tabla2 = {3, 1, 2};

        boolean iguales = true;

        if (tabla1.length != tabla2.length) {
            iguales = false;
        } else {
            boolean[] usados = new boolean[tabla2.length];

            for (int i = 0; i < tabla1.length; i++) {
                boolean encontrado = false;

                for (int j = 0; j < tabla2.length; j++) {
                    if (!usados[j] && tabla1[i] == tabla2[j]) {
                        usados[j] = true;
                        encontrado = true;
                    }
                }

                iguales = iguales && encontrado;
            }
        }

        if (iguales) {
            System.out.println("Las tablas son iguales...");
        } else {
            System.out.println("Las tablas no son iguales...");
        }
    }
}
