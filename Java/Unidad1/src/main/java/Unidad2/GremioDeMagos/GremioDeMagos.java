package Unidad2.GremioDeMagos;

import java.util.Scanner;

public class GremioDeMagos {

    public static boolean validarAcceso(String usuario, String contraseña, Scanner sc) {

        boolean contiene;

        while (true) {

            contiene = contraseña.contains("#") || contraseña.contains("*");

            if (contraseña.length() < 8) {
                System.out.println("La contraseña tiene que tener al menos 8 caracteres, inténtalo de nuevo...");
            }
            else if (!contiene) {
                System.out.println("La contraseña tiene que contener # o *");
            }
            else {
                return true;
            }

            System.out.print("Contraseña: ");
            contraseña = sc.nextLine();
        }
    }

    public static String cifradoDelConjuro(String conjuro) {
        String conjuroReverso = "";

        for (int i = conjuro.length() - 1; i >= 0; i--) {
            conjuroReverso += conjuro.charAt(i);
        }

        System.out.println("Número total de caracteres: " + conjuro.length());
        System.out.println("Conjuro al revés: " + conjuroReverso);

        return conjuroReverso;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nombre de Usuario: ");
        String usuario = sc.nextLine();

        System.out.print("Contraseña: ");
        String contraseña = sc.nextLine();

        if (validarAcceso(usuario, contraseña, sc)) {
            System.out.println("Acceso concedido al gremio de magos, bienvenido " + usuario);
        }

        System.out.print("Cual es tu conjuro?: ");
        String conjuro = sc.nextLine();


        if (conjuro.contains("maldicion")) {
            conjuro = conjuro.replace("maldicion", "bendicion");
        }

        System.out.println("Mensaje sin cifrar: " + conjuro);
        cifradoDelConjuro(conjuro);

    }
}
