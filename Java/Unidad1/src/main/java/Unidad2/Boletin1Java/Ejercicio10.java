package Unidad2.Boletin1Java;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio10 {
    static void main(String[] args) {
        Random random = new Random();
        int numAleatorio = random.nextInt(10);

        Ejercicio10 ref = new Ejercicio10();

        ref.adivinaNumero(numAleatorio);
    }


    void adivinaNumero(int numAleatorio) {

        int numIntentos = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Que numero crees que es?: ");
        int numeroAdivinar = sc.nextInt();
        numIntentos += 1;

        while (numeroAdivinar != numAleatorio) {
            System.out.print("Que numero crees que es?: ");
            numeroAdivinar = sc.nextInt();
            numIntentos += 1;
        }

        System.out.println("El numero " + numAleatorio + " ha sido adivinado en " + numIntentos + " intentos");
    }


}
