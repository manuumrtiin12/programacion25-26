package Unidad2.AACuentaBancaria;

import java.util.Objects;

public class Persona {

    private String dni;
    private String nombre;
    private String apellido;
    private int año;

    public boolean esMayorDeEdad(){

        boolean mayordeEdad = false;
        int edad = 2026 - this.año ;

        if (edad >= 18) {
            mayordeEdad = true;
        }

        return mayordeEdad;
    }

    public Persona(String dni, String nombre, String apellido, int año) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.año = año;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", año=" + año +
                '}';
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return año == persona.año && Objects.equals(dni, persona.dni) && Objects.equals(nombre, persona.nombre) && Objects.equals(apellido, persona.apellido);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni, nombre, apellido, año);
    }
}
