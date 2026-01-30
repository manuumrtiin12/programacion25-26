package Examen29Enero;

import java.util.Scanner;

public class PlataformaDigital {
    //APARTADO 1 NO


    public int buscaUsuario(String nombreUsuario, String[] usuarios, String[] contraseñas) {

        int posicion = -1;

        for (int i = 0; i < usuarios.length; i++) {
            if (usuarios[i].equals(nombreUsuario)) {
                posicion = i;
            }
        }

        return posicion;
    }

    public boolean verificacionInicioSesion(String nombreUsuario, String contraseña, String[] usuarios, String[] contraseñas) {

        boolean corresponde = false;

        int posicion = buscaUsuario(nombreUsuario, usuarios, contraseñas);

        if (posicion != -1) {
            if (contraseñas[posicion] == contraseña) {
                corresponde = true;
            }
        }

        return corresponde;
    }

    public void imprimeUsuariosRegistrados(String[] usuarios) {

        System.out.println("Usuarios registrados en la plataforma: ");
        for(int i = 0 ; i < usuarios.length ; i++) {
            System.out.println("-" + usuarios[i]);
        }
    }

    public void main(String[] args) {

        PlataformaDigital p = new PlataformaDigital();

        String frase = "\"alex{netflix23};bea{hbo_pass};carlos{prime99};dani{disneyPlus1};elena{movistar22};fran{sky_77};laura{atresPlayer};pablo{filmin88};sofia{stream2024};admin{root};\"";

        String[] usuarios = {"alex", "bea", "carlos", "dani", "elena", "fran", "laura", "pablo", "sofia", "admin"};
        String[] contraseñas = {"netflix23", "hbo_pass", "prime99", "disneyPlus1", "movistar22", "sky_77", "atresPlayer", "filmin88", "stream2024", "root"};

        //APARTADO2
        int buscado1 = p.buscaUsuario("carlos", usuarios, contraseñas);
        int buscado2 = p.buscaUsuario("carla", usuarios, contraseñas);

        System.out.println("Posicion: " + buscado1);
        System.out.println("Posicion: " + buscado2);

        //APARTADO3
        boolean verificando1 = p.verificacionInicioSesion("carla", "clave", usuarios, contraseñas);
        boolean verificando2 = p.verificacionInicioSesion("carlos", "clave", usuarios, contraseñas);
        boolean verificando3 = p.verificacionInicioSesion("carlos", "prime99", usuarios, contraseñas);

        System.out.println("Verificacion 1: " + verificando1);
        System.out.println("Verificacion 2: " + verificando2);
        System.out.println("Verificacion 3: " + verificando3);

        //APARTADO4

        p.imprimeUsuariosRegistrados(usuarios);




    }
}
