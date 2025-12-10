package main.java.Unidad2.Boletin1;
import java.util.Scanner;

public class Ejercicio11{
    static void main(String[] args) {

        Scanner escaner = new Scanner(System.in);
        System.out.print("Dame el primer numero");
        int numero1 = escaner.nextInt();

        System.out.print("Dame el segundo numero");
        int numero2 = escaner.nextInt();

        System.out.print("Dame el ultimo numero");
        int numero3 = escaner.nextInt();

        int numeroMayor = 0;

        if (numero1 > numero2 && numero1 > numero3) {
            numeroMayor = numero1;
        }
        else if (numero2 > numero1 && numero2 > numero3) {
            numeroMayor = numero2;

        } else{
            numeroMayor = numero3;
        }

        System.out.println("El numero mayor es: " + numeroMayor);
    }
}