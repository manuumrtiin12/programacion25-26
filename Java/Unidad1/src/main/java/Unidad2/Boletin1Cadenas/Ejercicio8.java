package Unidad2.Boletin1Cadenas;

public class Ejercicio8 {
    public static void main(String[] args) {

        int[] tablaOriginal = {2, 4, 6, 8};
        int[] tablaCopia = new int[tablaOriginal.length];

        for (int i = 0 ; i < tablaOriginal.length ; i++) {
            tablaCopia[i] = tablaOriginal[i];
        }

        for (int n : tablaOriginal) {
            System.out.print(n + " ");}
        System.out.println(" ");
        System.out.println(tablaOriginal);

        for (int n : tablaCopia) {
            System.out.print(n + " ");}
        System.out.println(" ");
        System.out.println(tablaCopia);


    }
}
