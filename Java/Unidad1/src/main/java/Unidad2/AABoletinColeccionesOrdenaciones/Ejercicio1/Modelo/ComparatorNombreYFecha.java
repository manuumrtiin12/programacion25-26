package main.java.Unidad2.AABoletinColeccionesOrdenaciones.Ejercicio1.Modelo;

import java.util.Comparator;

public class ComparatorNombreYFecha implements Comparator<Animal> {

    @Override
    public int compare(Animal a1, Animal a2) {

        int resultado = 0;
        resultado = a1.getNombre().compareTo(a2.getNombre());

        if (resultado == 0) {
            resultado = a1.getFechaNacimiento().compareTo(a2.getFechaNacimiento());  
        }

        return resultado;
    }
}
