package Unidad2.BoletinMASEJERCICIOSCONITERADORES;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {   // <-- debe ser public

        String pinto = "*";

        Scanner sc = new Scanner(System.in);
        System.out.print("Dame un numero: ");
        int numero = sc.nextInt();

        for (int i = 0; i < numero; i++) {
            System.out.println(pinto);
            pinto = pinto + "*";
        }
    }
}
