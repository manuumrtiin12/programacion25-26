package Unidad2.Retos;

import java.util.Scanner;

public class ArbolDeNavidad {
    static void main(String[] args) {

        String pinto;
        pinto = "*";

        Scanner sc = new Scanner(System.in);
        System.out.print("Dame un numero: ");
        int numero = sc.nextInt();

        for (int i = 0; i < numero; i++) {
            if (i == 0) {
                System.out.println("*");
            }
            else if (i == 1) {
                pinto += " " + "*";
            }

        }
    }
}
