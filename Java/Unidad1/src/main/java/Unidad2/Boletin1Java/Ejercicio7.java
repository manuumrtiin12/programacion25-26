package Unidad2.Boletin1Java;

import java.util.Scanner;

public class Ejercicio7 {
    static void main(String[] args) {
        Ejercicio7 ref = new Ejercicio7();

        Scanner sc = new Scanner(System.in);
        System.out.print("Numero: ");
        int numero = sc.nextInt();

        ref.imprimeMultiplos(numero);
    }

    void imprimeMultiplos(int numero){

        for (int i = numero ; i < numero*11; i++) {

            if (i % numero == 0){
            System.out.println(i);
            }
        }
    }
}
