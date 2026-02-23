package main.java.Unidad2.AABoletinClasesAbstractas.Ejercicio1.Modelo;

import java.time.LocalDate;

public abstract class Reptil extends Mascotas {

    protected int numMudadoPiel;
    protected int mesesGestacion;
    protected double peso;

    public Reptil(String nombre, int edad, String estado, LocalDate fechaNacimiento,
                  int numMudadoPiel, int mesesGestacion, double peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.estado = estado;
        this.fechaNacimiento = fechaNacimiento;
        this.numMudadoPiel = numMudadoPiel;
        this.mesesGestacion = mesesGestacion;
        this.peso = peso;
    }

    @Override
    public void muestra() {
        System.out.println(this.toString() +
                ", Mudado piel: " + numMudadoPiel +
                ", Meses gestación: " + mesesGestacion +
                ", Peso: " + peso + " kg");
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}