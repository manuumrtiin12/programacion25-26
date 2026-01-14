package main.java.Unidad2.sosMarte;
import java.util.Scanner;

public class sosMarteFunciones {

    public static void entradas(int numEntradas, String[] tablaRecursos,
                                int[] tablaCantidades, int[] tablaNivelAlerta) {

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < numEntradas; i++) {

            System.out.print("Nombre del recurso " + (i + 1) + ": ");
            tablaRecursos[i] = sc.nextLine();

            System.out.print("Cantidad del recurso " + (i + 1) + ": ");
            tablaCantidades[i] = sc.nextInt();

            System.out.print("Nivel crítico del recurso " + (i + 1) + ": ");
            tablaNivelAlerta[i] = sc.nextInt();
            sc.nextLine();
        }
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String [] tablaRecursos = new String[100];
        int [] tablaCantidades = new int [100];
        int [] tablaNivelAlerta = new int [100];

        System.out.print("¿Cuantos recursos quieres registrar?: ");
        int numEntradas = sc.nextInt();

        entradas(numEntradas,tablaRecursos, tablaCantidades, tablaNivelAlerta);
        
    }
}
