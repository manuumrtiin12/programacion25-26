package org.example.Modelo;

public class Humano extends EntidadStrangerThings{

    private boolean tieneEquipo;


    @Override
    public double calcularDannoPotencial(int factorAmenaza) {

        double dañoPotencial = 0;
        double dañoConEquipo = 20;

        dañoPotencial = getSaludBase() * 0.1 * factorAmenaza;

        if (this.tieneEquipo = true) {
            dañoPotencial += dañoConEquipo;
        }

        return dañoPotencial;
    }

    public Humano(String nombre, boolean tieneEquipo) {
        super(nombre);
        this.tieneEquipo = tieneEquipo;
    }

    public Humano(String nombre, double saludBase, boolean tieneEquipo) {
        super(nombre, saludBase);
        this.tieneEquipo = tieneEquipo;
    }
}
