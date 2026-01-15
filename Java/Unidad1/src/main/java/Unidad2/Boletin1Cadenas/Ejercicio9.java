package Unidad2.Boletin1Cadenas;

public class Ejercicio9 {
    public static void main(String[] args) {

        int[] tabla1 = {4, 4};
        int[] tabla2 = {4, 4, 2, 2};
        int[] tablaFinal = new int[tabla1.length + tabla2.length];

        for (int i = 0; i < tabla1.length; i++) {
            tablaFinal[i] = tabla1[i];
        }

        for (int i = 0; i < tabla2.length; i++) {
            tablaFinal[tabla1.length + i] = tabla2[i];
        }


        for (int n : tablaFinal) {
            System.out.print(n + " ");
        }
    }
}