package org.example.Modelo;

public class Depredador extends CriaturaUpsideDown{

    private boolean tieneHabilidadRegeneracion;

    public Depredador(String nombre, double nivelInfeccion) {
        super(nombre, nivelInfeccion);
    }

    public Depredador(String nombre, double saludBase, double nivelInfeccion) {
        super(nombre, saludBase, nivelInfeccion);
    }

    @Override
    public String toString() {
        return "Depredador{" +
                "tieneHabilidadRegeneracion=" + tieneHabilidadRegeneracion +
                ", contador=" + getContador() +
                ", idEntidad=" + getIdEntidad() +
                ", nombre='" + getNombre() + '\'' +
                ", saludBase=" + getSaludBase() +
                '}';
    }
}
