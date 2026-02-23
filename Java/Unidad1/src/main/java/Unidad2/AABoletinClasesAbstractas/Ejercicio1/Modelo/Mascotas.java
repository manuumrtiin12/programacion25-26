package main.java.Unidad2.AABoletinClasesAbstractas.Ejercicio1.Modelo;

import java.time.LocalDate;

public abstract class Mascotas {

    protected String nombre;
    protected int edad;
    protected String estado;
    protected LocalDate fechaNacimiento;

    @Override
    public String toString() {
        return "Nombre: " + nombre +
                ", Edad: " + edad +
                ", Estado: " + estado +
                ", Fecha Nacimiento: " + fechaNacimiento +
                ", Tipo: " + this.getClass().getSimpleName();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Mascotas otra = (Mascotas) obj;

        return this.nombre.equals(otra.nombre) &&
                this.edad == otra.edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public abstract void muestra();
    public void cumpleaños() {

        System.out.println("Cumpleaños " + this.fechaNacimiento);
    }

    public abstract void morir();
    public abstract void habla();
}