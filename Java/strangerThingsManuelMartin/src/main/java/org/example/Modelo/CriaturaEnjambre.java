package org.example.Modelo;

public class CriaturaEnjambre extends CriaturaUpsideDown{

    private int tamañoEjambre;

    public double calcularDannoPotencial(int factorAmenaza, CriaturaUpsideDown criatura) {

        double dañoPadre = criatura.calcularDannoPotencial(0);
        double dañoEnjambre = dañoPadre * tamañoEjambre;

        return dañoEnjambre;
    }

    public CriaturaEnjambre(String nombre, double nivelInfeccion, int tamañoEjambre) {
        super(nombre, nivelInfeccion);
        this.tamañoEjambre = tamañoEjambre;
    }

    @Override
    public String toString() {
        return "CriaturaEnjambre{" +
                "tamañoEjambre=" + tamañoEjambre +
                ", contador=" + getContador() +
                ", idEntidad=" + getIdEntidad() +
                ", nombre='" + getNombre() + '\'' +
                ", saludBase=" + getSaludBase() +
                '}';
    }
}
