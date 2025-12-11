package Unidad2.BoletinMATCH;

import java.util.Scanner;

public class Ejercicio6 {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Dime un numero de habitacion: ");
        int numero = sc.nextInt();

        int numeroCamas = 0;
        String planta = "";
        String color = "";

        switch (numero) {
            case 1:
                color = "Azul";
                numeroCamas = 2;
                planta = "Primera";
                break;

            case 2:
                color = "Rojo";
                numeroCamas = 1;
                planta = "Primera";
                break;

            case 3:
                color = "Verde";
                numeroCamas = 3;
                planta = "Segunda";
                break;

            case 4:
                color = "Rosa";
                numeroCamas = 2;
                planta = "Segunda";
                break;

            case 5:
                color = "Gris";
                numeroCamas = 1;
                planta = "Tercera";
                break;

            default:
                System.out.println("Ese numero de habitacion no existe");

        }
        System.out.println("La habitacion " + color + " con " + numeroCamas + " cama/s, esta en la planta " + planta);
    }
}
