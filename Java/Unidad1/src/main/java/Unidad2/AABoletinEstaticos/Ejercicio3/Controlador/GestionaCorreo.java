package main.java.Unidad2.AABoletinEstaticos.Ejercicio3.Controlador;

import java.util.Scanner;
import main.java.Unidad2.AABoletinEstaticos.Ejercicio3.Modelo.CorreoElectronico;

public class GestionaCorreo {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        CorreoElectronico[] correos = new CorreoElectronico[5];

        int contador = 0;

        while (contador < 5) {
            String correo = teclado.nextLine();

            if (CorreoElectronico.esCorreoValido(correo)) {
                correos[contador] = new CorreoElectronico(correo);
                contador++;
                System.out.println("Correo valido");
            } else {
                System.out.println("Correo no valido");
            }
        }

        for (int i = 0; i < correos.length; i++) {
            System.out.println(correos[i]);
        }

        teclado.close();
    }
}