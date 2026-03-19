package main.java.Unidad2.AABoletinColeccionesOrdenaciones.Ejercicio1.Modelo;

import java.time.LocalDate;
import java.util.Objects;

public class Animal implements Comparable{

    private int id;
    private String nombre;
    private String especie;
    private int edad;
    private ClasificacionComida clasificacionComida;
    private LocalDate fechaNacimiento;
    private int peso;
    private TipoHabitad habitad;
    private ClasificacionGestacion clasificacicionGestacion;

    @Override
    public int compareTo(Object o) {

        Animal aComp = (Animal) o;

        int resultado = this.getNombre().compareTo(aComp.getNombre());

        if (resultado == 0) {

            resultado = this.id - aComp.getId();
        }

        return resultado;
    }


    public Animal(int id, String nombre, String especie, int edad, ClasificacionComida clasificacionComida, LocalDate fechaNacimiento, int peso, TipoHabitad habitad, ClasificacionGestacion clasificacicionGestacion) {
        this.id = id;
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.clasificacionComida = clasificacionComida;
        this.fechaNacimiento = fechaNacimiento;
        this.peso = peso;
        this.habitad = habitad;
        this.clasificacicionGestacion = clasificacicionGestacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public ClasificacionComida getClasificacionComida() {
        return clasificacionComida;
    }

    public void setClasificacionComida(ClasificacionComida clasificacionComida) {
        this.clasificacionComida = clasificacionComida;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public TipoHabitad getHabitad() {
        return habitad;
    }

    public void setHabitad(TipoHabitad habitad) {
        this.habitad = habitad;
    }

    public ClasificacionGestacion getClasificacicionGestacion() {
        return clasificacicionGestacion;
    }

    public void setClasificacicionGestacion(ClasificacionGestacion clasificacicionGestacion) {
        this.clasificacicionGestacion = clasificacicionGestacion;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return id == animal.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + getId() +
                ", nombre='" + getNombre() + '\'' +
                ", especie='" + getEspecie() + '\'' +
                ", edad=" + getEdad() +
                ", clasificacionComida=" + getClasificacionComida() +
                ", fechaNacimiento=" + getFechaNacimiento() +
                ", peso=" + getPeso() +
                ", habitad=" + getHabitad() +
                ", clasificacicionGestacion=" + getClasificacicionGestacion() +
                '}';
    }
}
