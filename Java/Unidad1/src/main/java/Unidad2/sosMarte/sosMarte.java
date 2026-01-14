package Unidad2.sosMarte;

import java.util.Scanner;

public class sosMarte {

    

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] tablaRecursos = new String[99];
        int[] tablaCantidades = new int[99];
        int[] tablaNivelCritico = new int[99];

        System.out.print("¿Cuántas entradas vas a hacer?: ");
        int numEntradas = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < numEntradas; i++) {
            System.out.print("Nombre del recurso " + (i + 1) + ": ");
            tablaRecursos[i] = sc.nextLine();

            System.out.print("Cantidad del recurso " + (i + 1) + ": ");
            tablaCantidades[i] = sc.nextInt();

            System.out.print("Nivel crítico del recurso " + (i + 1) + ": ");
            tablaNivelCritico[i] = sc.nextInt();
            sc.nextLine();
        }

        String mensajeError = "ERR_SISTEMA::Agua::-15++FIN";
        System.out.println(mensajeError);

        String[] partesMensajeError = mensajeError.split("::");
        String palabraBuscada = partesMensajeError[1];

        for (int i = 0; i < tablaRecursos.length; i++) {
            if (tablaRecursos[i] != null && tablaRecursos[i].equalsIgnoreCase(palabraBuscada)) {
                System.out.println("Recurso: " + tablaRecursos[i] +
                        " Cantidad: " + tablaCantidades[i] +
                        " Nivel Critico: " + tablaNivelCritico[i]);
            }

            if (tablaCantidades[i] < tablaNivelCritico[i]) {
                System.out.println("¡ALERTA CRITICA EN " + tablaRecursos[i].toUpperCase() + "!");
            }

            else {
                System.out.println("VALIDADO EL RECURSO " + tablaRecursos[i].toUpperCase());
            }
        }
    }
}