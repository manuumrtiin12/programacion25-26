package main.java.Unidad2;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class CumpleDesi {

    public static void main(String[] args) {

        LinkedHashSet<String> listaInvitados = new LinkedHashSet<String>();

        Scanner sc = new Scanner(System.in);

        System.out.print("Invitado: ");
        String invitado = sc.nextLine();

        while(!invitado.equals("close")) {

            listaInvitados.add(invitado);

            System.out.print("Invitado: ");
            invitado = sc.nextLine();

        }

        System.out.println(listaInvitados);
        System.out.println(listaInvitados.size());
    }
}