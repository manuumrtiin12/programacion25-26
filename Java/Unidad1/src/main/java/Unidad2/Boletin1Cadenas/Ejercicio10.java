package Unidad2.Boletin1Cadenas;

public class Ejercicio10 {
    public static boolean existe(int[] tabla, int limite, int valor) {
        for (int i = 0; i < limite; i++) {
            if (tabla[i] == valor) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int[] tabla1 = {4, 4};
        int[] tabla2 = {4, 4, 2, 2};
        int[] tablaFinal = new int[tabla1.length + tabla2.length];
        int contador = 0;

        for (int i = 0; i < tabla1.length; i++) {
            if (!existe(tablaFinal, contador, tabla1[i])) {
                tablaFinal[contador] = tabla1[i];
                contador += 1;
            }
        }

        for (int i = 0; i < tabla2.length; i++) {
            if (!existe(tablaFinal, contador, tabla2[i])) {
                tablaFinal[contador] = tabla2[i];
                contador += 1;
            }
        }

        for (int i = 0; i < contador; i++) {
            System.out.print(tablaFinal[i] + " ");
        }
    }
}
