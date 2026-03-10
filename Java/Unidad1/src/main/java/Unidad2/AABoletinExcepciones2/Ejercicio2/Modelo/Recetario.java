package main.java.Unidad2.AABoletinExcepciones2.Ejercicio2.Modelo;

import main.java.Unidad2.AABoletinExcepciones2.Ejercicio2.Excepciones.CocinaException;

public class Recetario {

    private Receta[] recetas;

    public Recetario() {
        recetas = new Receta[10];
    }

    public void agregarReceta(Receta receta, int posicion) {
        recetas[posicion] = receta;
    }

    public Receta buscar(int id) {

        for (Receta receta : recetas) {

            if (receta != null && receta.getId() == id) {
                return receta;
            }
        }

        throw new CocinaException("La receta no existe en el recetario");
    }
}