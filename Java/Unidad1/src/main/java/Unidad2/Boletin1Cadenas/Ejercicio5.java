package main.java.Unidad2.Boletin1Cadenas;

public class Ejercicio5 {
    public static void main(String[] args) {

        int[] tabla1 = {1, 2, 3};
        int[] tabla2 = {1, 2, 3};

        boolean iguales = true;

        if (tabla1.length != tabla2.length) {
            iguales = false;
        } else {
            for (int i = 0; i < tabla1.length; i++) {
                iguales = iguales && (tabla1[i] == tabla2[i]);
            }
        }

        if (iguales) {
            System.out.println("Las tablas son iguales...");
        } else {
            System.out.println("Las tablas no son iguales...");
        }
    }
}
