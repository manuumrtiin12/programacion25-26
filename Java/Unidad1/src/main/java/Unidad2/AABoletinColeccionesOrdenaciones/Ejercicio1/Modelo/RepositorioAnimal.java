package main.java.Unidad2.AABoletinColeccionesOrdenaciones.Ejercicio1.Modelo;

import java.util.Objects;
import java.util.TreeSet;

public class RepositorioAnimal {

    private String nombre;
    private String lugar;
    private int presupuestoAnual;
    private TreeSet<Animal> listaAnimales;


    public void updateAnimal(){}

    public void addAnimal


    public RepositorioAnimal(String nombre, String lugar, int presupuestoAnual, TreeSet<Animal> listaAnimales) {
        this.nombre = nombre;
        this.lugar = lugar;
        this.presupuestoAnual = presupuestoAnual;
        this.listaAnimales = listaAnimales;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public int getPresupuestoAnual() {
        return presupuestoAnual;
    }

    public void setPresupuestoAnual(int presupuestoAnual) {
        this.presupuestoAnual = presupuestoAnual;
    }

    public TreeSet<Animal> getListaAnimales() {
        return listaAnimales;
    }

    public void setListaAnimales(TreeSet<Animal> listaAnimales) {
        this.listaAnimales = listaAnimales;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        RepositorioAnimal that = (RepositorioAnimal) o;
        return presupuestoAnual == that.presupuestoAnual && Objects.equals(nombre, that.nombre) && Objects.equals(lugar, that.lugar) && Objects.equals(listaAnimales, that.listaAnimales);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, lugar, presupuestoAnual, listaAnimales);
    }

    @Override
    public String toString() {
        return "RepositorioAnimal{" +
                "nombre='" + getNombre() + '\'' +
                ", lugar='" + getLugar() + '\'' +
                ", presupuestoAnual=" + getPresupuestoAnual() +
                ", listaAnimales=" + getListaAnimales() +
                '}';
    }
}
