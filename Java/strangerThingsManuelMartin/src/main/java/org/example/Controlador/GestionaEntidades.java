package org.example.Controlador;

import org.example.Modelo.*;

import java.util.Scanner;

public class GestionaEntidades {

    public int getNumeroObjetos(EntidadStrangerThings[] entidades) {

        int contador = 0;

        System.out.println("============================");
        System.out.println("¿Que entidad quieres buscar?");
        System.out.println("============================");
        System.out.println("1. Humanos General");
        System.out.println("2. Miembros del Grupo");
        System.out.println("3. Criaturas Extrañas");
        System.out.println("4. Enjambres");
        System.out.println("5. Depredadores");

        System.out.print("Opcion: ");
        Scanner sc = new Scanner(System.in);
        int opcionMenu = sc.nextInt();


        if (opcionMenu == 1) {
            for (int i = 0 ; i < entidades.length ; i++) {
                if (entidades[i] instanceof Humano == true) {
                    contador++;
                }
            }
        }
        else if (opcionMenu == 2) {
            for (int i = 0 ; i < entidades.length ; i++) {
                if (entidades[i] instanceof MiembroGrupoHawkings == true) {
                    contador++;
                }
            }
        }

        else if (opcionMenu == 3) {
            for (int i = 0 ; i < entidades.length ; i++) {
                if (entidades[i] instanceof CriaturaUpsideDown == true) {
                    contador++;
                }
            }
        }

        else if (opcionMenu == 4) {
            for (int i = 0 ; i < entidades.length ; i++) {
                if (entidades[i] instanceof CriaturaEnjambre == true) {
                    contador++;
                }
            }
        }

        else if (opcionMenu == 5) {
            for (int i = 0 ; i < entidades.length ; i++) {
                if (entidades[i] instanceof Depredador == true) {
                    contador++;
                }
            }
        }

        System.out.println("El numero es de: " + contador);
        return contador;
    }

    public void main(String[] args) {

        EntidadStrangerThings [] entidades = new EntidadStrangerThings[10];

        Humano h1 = new Humano("Pepe", true);
        Humano h2 = new Humano("Alfonso", false);

        MiembroGrupoHawkings m1 = new MiembroGrupoHawkings("Marcelo", true, false);
        MiembroGrupoHawkings m2 = new MiembroGrupoHawkings("Rodolfo", false, true);

        CriaturaUpsideDown c1 = new CriaturaUpsideDown("Demogorgon",0.5);
        CriaturaUpsideDown c2 = new CriaturaUpsideDown("Demoperro",0.8);

        CriaturaEnjambre e1 = new CriaturaEnjambre("Demomurcielagos", 0.5, 5);
        CriaturaEnjambre e2 = new CriaturaEnjambre("DemoCerdos", 0.8, 10);

        Depredador d1 = new Depredador("Azotamentes", 0,5);
        Depredador d2 = new Depredador("Vecna", 1);

        entidades[0] = h1;
        entidades[1] = h2;
        entidades[2] = m1;
        entidades[3] = m2;
        entidades[4] = c1;
        entidades[5] = c2;
        entidades[6] = e1;
        entidades[7] = e2;
        entidades[8] = d1;
        entidades[9] = d2;

        System.out.println("==================================");
        System.out.println("AQUI MOSTRAMOS TODA LA INFORMACION");
        System.out.println("==================================");

        for (int i = 0 ; i < entidades.length ; i++) {

            if (entidades[i] != null) {

                System.out.println("Entidad " + i + ": " + entidades[i]);
            }
        }

        System.out.println("======================================");
        System.out.println("AQUI MOSTRAMOS EL METODO DE HACER DAÑO");
        System.out.println("======================================");

        for (int i = 0 ; i < entidades.length ; i++) {

            if (entidades[i] != null) {
                System.out.println("Entidad " + i + ": " + entidades[i].calcularDannoPotencial(3));
            }

            }

        System.out.println("============================");
        System.out.println("AQUI MOSTRAMOS EL APARTADO 7");
        System.out.println("============================");

        for (int i = 0 ; i < entidades.length ; i++) {

            if (entidades[i] != null) {

                if (entidades[i] instanceof MiembroGrupoHawkings == true) {
                    System.out.println("Usa sus poderes para defenderse del upside down!");
                    System.out.println("Entidad " + i + ": " + entidades[i].calcularDannoPotencial(3));

                }

                else {

                System.out.println("Entidad " + i + ": " + entidades[i].calcularDannoPotencial(3));
                }
            }
        }

        System.out.println("================================");
        System.out.println("AQUI MOSTRAMOS EL APARTADO 8 + 9");
        System.out.println("================================");

        getNumeroObjetos(entidades);

    }
}
