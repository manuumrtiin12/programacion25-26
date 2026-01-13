package Unidad2.Pruebas;

public class PruebaCadenas {
    public static void main(String[] args) {

        int[] tablaNumeros = new int[10];

        System.out.println(tablaNumeros.length); // 10
        System.out.println(tablaNumeros[0]);     // 0
        System.out.println(tablaNumeros);

        boolean[] tablaBooleanos = new boolean[10];

        System.out.println(tablaBooleanos.length); // 10
        System.out.println(tablaBooleanos[0]);     // false
        System.out.println(tablaBooleanos);

        int[] tablaVacia = new int[50];

        for (int i = 0; i < 50; i++) {
            tablaVacia[i] = i + 1;
        }

        System.out.println("La tabla es " + tablaVacia);
    }
}
