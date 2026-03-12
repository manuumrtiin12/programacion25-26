package main.java.Unidad2.AABoletinListasColecciones.Ejercicio1.Modelo;

import java.util.ArrayList;
import java.util.List;

public class Dia {

    private String nombre;
    private List<Modulo> modulos;

    public Dia(String nombre) {
        this.nombre = nombre;
        this.modulos = new ArrayList<>();
    }

    public void asignarModulo(Modulo m) {

        if (modulos.size() < 6) {
            modulos.add(m);
        }
    }

    public Modulo obtenerModulo(int posicion) {

        if (posicion >= 0 && posicion < modulos.size()) {
            return modulos.get(posicion);
        }

        return null;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Modulo> getModulos() {
        return modulos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setModulos(List<Modulo> modulos) {
        this.modulos = modulos;
    }

    @Override
    public String toString() {
        return "Dia{" +
                "nombre='" + nombre + '\'' +
                ", modulos=" + modulos +
                '}';
    }
}