package Unidad2.BoletinDIAGRAMADEFLUJO;

import java.util.Random;
import java.util.Scanner;


public class Ejercicio14 {
    static void main(String[] args) {

        Random r = new Random();
        Scanner sc = new Scanner(System.in);

        int numero1 = r.nextInt(4);
        int numero2 = r.nextInt(4);

        System.out.println(numero1);
        System.out.println(numero2);


        System.out.print("Cual crees que es la suma: ");
        int resultado = sc.nextInt();

        while (resultado != numero1 + numero2) {
            System.out.println("Resultado incorrecto, intentalo de nuevo: ");
            System.out.print("Cual crees que es la suma: ");
             resultado = sc.nextInt();
        }

        System.out.println(("Enhorabuena, has acertado! "));
    }
}
