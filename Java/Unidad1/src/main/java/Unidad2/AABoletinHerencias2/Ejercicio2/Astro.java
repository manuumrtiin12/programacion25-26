package main.java.Unidad2.AABoletinHerencias2.Ejercicio2;

import java.util.Objects;

public class Astro {

    private String nombre;
    private double masa;
    private double diametro;
    private double periodoRotacion;
    private double periodoTraslacion;
    private double distanciaMedia;

    public void muestraInformacion(Astro obj) {

        System.out.println(obj.toString());
    }

    public Astro(String nombre, double masa, double diametro,
                 double periodoRotacion, double periodoTraslacion,
                 double distanciaMedia) {
        this.nombre = nombre;
        this.masa = masa;
        this.diametro = diametro;
        this.periodoRotacion = periodoRotacion;
        this.periodoTraslacion = periodoTraslacion;
        this.distanciaMedia = distanciaMedia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getMasa() {
        return masa;
    }

    public void setMasa(double masa) {
        this.masa = masa;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    public double getPeriodoRotacion() {
        return periodoRotacion;
    }

    public void setPeriodoRotacion(double periodoRotacion) {
        this.periodoRotacion = periodoRotacion;
    }

    public double getPeriodoTraslacion() {
        return periodoTraslacion;
    }

    public void setPeriodoTraslacion(double periodoTraslacion) {
        this.periodoTraslacion = periodoTraslacion;
    }

    public double getDistanciaMedia() {
        return distanciaMedia;
    }

    public void setDistanciaMedia(double distanciaMedia) {
        this.distanciaMedia = distanciaMedia;
    }

    @Override
    public String toString() {
        return "Astro: " + nombre + " | Masa: " + masa + " | Diámetro: " + diametro;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Astro astro = (Astro) o;
        return Double.compare(masa, astro.masa) == 0 && Double.compare(diametro, astro.diametro) == 0 && Double.compare(periodoRotacion, astro.periodoRotacion) == 0 && Double.compare(periodoTraslacion, astro.periodoTraslacion) == 0 && Double.compare(distanciaMedia, astro.distanciaMedia) == 0 && Objects.equals(nombre, astro.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, masa, diametro, periodoRotacion, periodoTraslacion, distanciaMedia);
    }
}
