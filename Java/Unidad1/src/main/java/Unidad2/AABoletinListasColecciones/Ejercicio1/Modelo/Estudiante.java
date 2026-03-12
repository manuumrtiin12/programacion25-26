package main.java.Unidad2.AABoletinListasColecciones.Ejercicio1.Modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Estudiante {

    private String nombre;
    private String id;
    private List<Double> notas;

    public Estudiante(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
        this.notas = new ArrayList<>();
    }

    public void agregarNota(double nota) {
        notas.add(nota);
    }

    public double calcularPromedio() {

        if (notas.isEmpty()) {
            return 0;
        }

        double suma = 0;

        for (Double nota : notas) {
            suma += nota;
        }

        return suma / notas.size();
    }

    public String getNombre() {
        return nombre;
    }

    public String getId() {
        return id;
    }

    public List<Double> getNotas() {
        return notas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNotas(List<Double> notas) {
        this.notas = notas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Estudiante)) return false;
        Estudiante that = (Estudiante) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", id='" + id + '\'' +
                ", notas=" + notas +
                '}';
    }
}