package Unidad2.Boletin1Cadenas;

public class Ejercicio7 {
    public static void main(String[] args) {

        int[] desordenados = {1, 9, 5, 2};
        int[] ordenados = new int[desordenados.length];

        for (int i = 0; i < desordenados.length; i++) {
            ordenados[i] = desordenados[i];
        }

        for (int i = 0; i < ordenados.length - 1; i++) {
            for (int j = i + 1; j < ordenados.length; j++) {
                if (ordenados[i] > ordenados[j]) {
                    int temp = ordenados[i];
                    ordenados[i] = ordenados[j];
                    ordenados[j] = temp;
                }
            }
        }
        for (int n : desordenados) {
            System.out.print(n + " ");
        }
        System.out.println(" ");

        for (int n : ordenados) {
            System.out.print(n + " ");
        }
    }
}
