package main.java.Unidad2.AABoletinListasColecciones.Ejercicio2.Modelo;

import java.util.Objects;

public class Alumno implements Comparable {

    private String nombre;
    private String DNI;

    public Alumno(String nombre, String DNI) {
        this.nombre = nombre;
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Alumno alumno = (Alumno) o;
        return Objects.equals(DNI, alumno.DNI);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(DNI);
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + getNombre() + '\'' +
                ", DNI='" + getDNI() + '\'' +
                '}';
    }

    @Override
    public int compareTo(Object o) {

        return 0;
    }
}
