package main.java.Unidad2.AABoletinInterfaces1.Ejercicio2.Modelo;

import java.util.Objects;

public abstract class RecursosPrestar implements Prestable {

    private int unidadesTotales;
    private int unidadesPrestadas;

    public RecursosPrestar(int unidadesTotales) {
        this.unidadesTotales = unidadesTotales;
        this.unidadesPrestadas = unidadesPrestadas;
    }

    public int getUnidadesTotales() {
        return unidadesTotales;
    }

    public void setUnidadesTotales(int unidadesTotales) {
        this.unidadesTotales = unidadesTotales;
    }

    public int getUnidadesPrestadas() {
        return unidadesPrestadas;
    }

    public void setUnidadesPrestadas(int unidadesPrestadas) {
        this.unidadesPrestadas = unidadesPrestadas;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        RecursosPrestar that = (RecursosPrestar) o;
        return unidadesTotales == that.unidadesTotales && unidadesPrestadas == that.unidadesPrestadas;
    }

    @Override
    public int hashCode() {
        return Objects.hash(unidadesTotales, unidadesPrestadas);
    }

    @Override
    public String toString() {
        return "RecursosPrestar{" +
                "unidadesTotales=" + unidadesTotales +
                ", unidadesPrestadas=" + unidadesPrestadas +
                '}';
    }
}