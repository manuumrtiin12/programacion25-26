package main.java.Unidad2.AABoletinExcepciones2.Ejercicio2.Controlador;

import main.java.Unidad2.AABoletinExcepciones2.Ejercicio2.Modelo.Receta;
import main.java.Unidad2.AABoletinExcepciones2.Ejercicio2.Modelo.Recetario;
import main.java.Unidad2.AABoletinExcepciones2.Ejercicio2.Excepciones.CocinaException;

public class GestionaRecetario {

    public static void main(String[] args) {

        Recetario recetario = new Recetario();

        String[] ingredientes = {"Huevos", "Leche", "Harina"};
        int[] cantidades = {2, 200, 100};

        Receta receta1 = new Receta(ingredientes, cantidades);

        recetario.agregarReceta(receta1, 0);

        try {

            Receta receta = recetario.buscar(1);

            receta.cocinar(3);
            receta.cocinar(0);
            receta.cocinar(2000);

        } catch (CocinaException e) {

            System.out.println("Error: " + e.getMessage());

        }

        try {

            recetario.buscar(99);

        } catch (CocinaException e) {

            System.out.println("Error al buscar: " + e.getMessage());

        }
    }
}