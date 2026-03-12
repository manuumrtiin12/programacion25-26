package main.java.Unidad2.AABoletinListasColecciones.Ejercicio1.Modelo;

public class Modulo {

    private String nombre;

    public Modulo(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }
}