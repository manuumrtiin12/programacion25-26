package org.example.Modelo;

import java.util.Objects;

public abstract class EntidadStrangerThings {

    private int contador = 0;
    private int idEntidad;
    private String nombre;
    private double saludBase;

    public EntidadStrangerThings(String nombre) {
        this.contador += 1;
        this.idEntidad = contador;
        this.nombre = nombre;
        this.saludBase = 10.0;
    }

    public EntidadStrangerThings(String nombre, double saludBase) {
        this.nombre = nombre;

        if(this.saludBase < 0) {
            this.saludBase = 0;
        }
    }

    public abstract double calcularDannoPotencial(int factorAmenaza);

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        EntidadStrangerThings that = (EntidadStrangerThings) o;
        return contador == that.contador;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(contador);
    }

    @Override
    public String toString() {
        return "[" +
                "| idEntidad=" + idEntidad +
                "| nombre='" + nombre + '\'' +
                "| saludBase=" + saludBase +
                "] EntidadStrangerThings";
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public int getIdEntidad() {
        return idEntidad;
    }

    public void setIdEntidad(int idEntidad) {
        this.idEntidad = idEntidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSaludBase() {
        return saludBase;
    }

    public void setSaludBase(double saludBase) {
        this.saludBase = saludBase;
    }
}
