package Unidad2.Boletin1Cadenas;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] cadena= {1, 9, 5, 2};

        System.out.print("Dame un numero: ");
        int numero = sc.nextInt();

        boolean encontrado = false;
        int posicion = 0;
        int i = 0;

        while (i < cadena.length && !encontrado) {
            if (numero == cadena[i]) {
                System.out.println("El numero esta en la posicion " + i);
                encontrado = true;
            }
            else {
                posicion = i + 1;
            }
            i++;
        }

        if (!encontrado) {
            System.out.println("El numero no esta en la tabla (-1)");
        }
    }
}


