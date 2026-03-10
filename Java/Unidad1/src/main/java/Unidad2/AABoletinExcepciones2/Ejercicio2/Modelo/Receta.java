package main.java.Unidad2.AABoletinExcepciones2.Ejercicio2.Modelo;

import main.java.Unidad2.AABoletinExcepciones2.Ejercicio2.Excepciones.CocinaException;

import java.util.Arrays;
import java.util.Objects;

public class Receta {

    private int contador = 0;
    private int id;
    private String [] ingredientes;
    private int [] cantidadIngredientes;

    public void cocinar(int comensales) {

        if (comensales <= 0) {
            System.out.println("Número de comensales inválido");
            return;
        }

        if (comensales > 1000) {
            throw new CocinaException("El número de comensales es demasiado alto");
        }

        for (int i = 0; i < cantidadIngredientes.length; i++) {

            int cantidad = cantidadIngredientes[i] * comensales;
            cantidadIngredientes[i] = cantidad;
        }

        System.out.println("Las nuevas cantidades son:");

        for (int i = 0; i < ingredientes.length; i++) {

            System.out.println(ingredientes[i] + ": " + cantidadIngredientes[i]);
        }
    }

    public Receta(String[] ingredientes, int[] cantidadIngredientes) {
        contador++;
        this.id = contador;
        this.ingredientes = ingredientes;
        this.cantidadIngredientes = cantidadIngredientes;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String[] getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String[] ingredientes) {
        this.ingredientes = ingredientes;
    }

    public int[] getCantidadIngredientes() {
        return cantidadIngredientes;
    }

    public void setCantidadIngredientes(int[] cantidadIngredientes) {
        this.cantidadIngredientes = cantidadIngredientes;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Receta receta = (Receta) o;
        return id == receta.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Receta{" +
                ", id=" + id +
                ", ingredientes=" + Arrays.toString(ingredientes) +
                ", cantidadIngredientes=" + Arrays.toString(cantidadIngredientes) +
                '}';
    }


}
