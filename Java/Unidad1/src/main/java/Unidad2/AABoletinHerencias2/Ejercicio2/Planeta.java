package main.java.Unidad2.AABoletinHerencias2.Ejercicio2;

import java.util.ArrayList;

public class Planeta extends Astro {

    private ArrayList<Satelite> satelites;


    public Planeta(String nombre, double masa, double diametro,
                   double periodoRotacion, double periodoTraslacion,
                   double distanciaMedia) {
        super(nombre, masa, diametro, periodoRotacion, periodoTraslacion, distanciaMedia);
        satelites = new ArrayList<>();
    }

    public ArrayList<Satelite> getSatelites() {
        return satelites;
    }

    public void setSatelites(ArrayList<Satelite> satelites) {
        this.satelites = satelites;
    }

}
