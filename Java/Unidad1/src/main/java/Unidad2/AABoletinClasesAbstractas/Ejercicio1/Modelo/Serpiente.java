package main.java.Unidad2.AABoletinClasesAbstractas.Ejercicio1.Modelo;

import java.time.LocalDate;

public class Serpiente extends Reptil {

    private String especie;

    public Serpiente(String nombre, int edad, String estado, LocalDate fechaNacimiento,
                     int numMudadoPiel, int mesesGestacion, double peso, String especie) {
        super(nombre, edad, estado, fechaNacimiento, numMudadoPiel, mesesGestacion, peso);
        this.especie = especie;
    }

    @Override
    public void habla() {
        System.out.println(nombre + " no habla");
    }

    @Override
    public void morir() {
        this.estado = "Muerta";
        System.out.println(nombre + " ha muerto.");
    }

    @Override
    public void muestra() {
        System.out.println(this.toString() +
                ", Mudado piel: " + numMudadoPiel +
                ", Meses gestación: " + mesesGestacion +
                ", Peso: " + peso + " kg" +
                ", Especie: " + especie);
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }
}