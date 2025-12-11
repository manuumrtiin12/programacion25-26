package Unidad2.BoletinIF;
import java.util.Scanner;

public class Ejercicio10 {
    static void main(String[] args) {

        Scanner escaner = new Scanner(System.in);

        System.out.print("Dame un numero: ");
        int numero1 = escaner.nextInt();

        System.out.print("Dame otro numero: ");
        int numero2 = escaner.nextInt();

        float resultado = (float) numero1 / numero2;

        if (numero2 != 0) {
            System.out.println("El resultado de la division es: " + resultado);
        }
        else {
            System.out.println("El segundo numero no puede ser cero");

        }
    }
}
