package org.example.Modelo;

public class CriaturaUpsideDown extends EntidadStrangerThings{

    private double nivelInfeccion;

    @Override
    public double calcularDannoPotencial(int factorAmenaza) {

        double dañoPotencial = 0;
        double infeccion = this.nivelInfeccion;

        if (infeccion >= 0 && infeccion <= 1) {

            dañoPotencial = getSaludBase() * (1 + infeccion);
        }

        if (infeccion >= 0.8) {
            dañoPotencial += 50;
        }

        else {
            dañoPotencial = 0;
        }

        return dañoPotencial;
    }

    public CriaturaUpsideDown(String nombre, double nivelInfeccion) {
        super(nombre);
        this.nivelInfeccion = nivelInfeccion;
    }

    public CriaturaUpsideDown(String nombre, double saludBase, double nivelInfeccion) {
        super(nombre, saludBase);
        this.nivelInfeccion = nivelInfeccion;
    }

    @Override
    public String toString() {
        return "CriaturaUpsideDown{" +
                "nivelInfeccion=" + nivelInfeccion +
                ", contador=" + getContador() +
                ", idEntidad=" + getIdEntidad() +
                ", nombre='" + getNombre() + '\'' +
                ", saludBase=" + getSaludBase() +
                '}';
    }
}
