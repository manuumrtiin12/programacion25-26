package main.java.Unidad2.AAOrientacionObjetoIntroduccion;

import java.util.Scanner;

public class Ejercicio2GestionaGato {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Ejercicio2Gato gatoMacho = new Ejercicio2Gato("Negro", "Siamés", 'M', 3, 5);
        Ejercicio2Gato gataHembra1 = new Ejercicio2Gato("Blanco", "Persa", 'H', 4, 4);
        Ejercicio2Gato gataHembra2 = new Ejercicio2Gato("Gris", "Europeo", 'H', 2, 3);

        System.out.println("Primer gato:");
        gatoMacho.queHace(sc);
        gatoMacho.come(sc);

        System.out.println("Segundo gato:");
        gataHembra1.queHace(sc);
        gataHembra1.come(sc);

        System.out.println("Pelea entre las dos gatas:");
        gataHembra1.pelear(gataHembra2);

        System.out.println("Pelea entre el gato macho y una hembra:");
        gatoMacho.pelear(gataHembra1);
    }
}