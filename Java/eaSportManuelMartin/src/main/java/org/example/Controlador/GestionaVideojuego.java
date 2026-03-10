package org.example.Controlador;

import org.example.Modelo.Mapa;
import org.example.Modelo.PersonajeJugable;
import org.example.Modelo.Tactico;
import org.example.Modelo.Tanque;

public class GestionaVideojuego {

    public void main(String[] args) {


        //APARTADO 3.1

        System.out.println("============");
        System.out.println("APARTADO 3.1");
        System.out.println("============");

        PersonajeJugable [] personajes = new PersonajeJugable[6];

        Tanque t1 = new Tanque("Destructor", 50, 50);

        Tactico ta1 = new Tactico("Heroe", 85, new Mapa[10]);
        Tactico ta2= new Tactico("Valiente", 150, new Mapa[10]);

        personajes[0] = t1;
        personajes[1] = ta1;
        personajes[2] = ta2;

        for (int i = 0 ; i < personajes.length ; i++) {

            if (personajes[i] != null) {
                System.out.println(personajes[i].toString());
            }
        }

        //APARTADO 3.2

        System.out.println("============");
        System.out.println("APARTADO 3.2");
        System.out.println("============");

        ta1.addMapaVentaja(Mapa.BIND);
        ta2.addMapaVentaja(Mapa.valueOf("SPLIT"));

        System.out.println(ta1.toString());
        System.out.println(ta2.toString());

        //APARTADO 3.3

        System.out.println("============");
        System.out.println("APARTADO 3.3");
        System.out.println("============");

        for (int i = 0 ; i < personajes.length ; i++) {
            if (personajes[i] != null) {
                System.out.println(personajes[i].generarMetrica() + " Rango: " + personajes[i].getRangoCompetitivo());

            }
        }
    }
}
