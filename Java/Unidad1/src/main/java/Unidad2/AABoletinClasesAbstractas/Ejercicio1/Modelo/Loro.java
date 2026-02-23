package main.java.Unidad2.AABoletinClasesAbstractas.Ejercicio1.Modelo;

public class Loro extends Aves {

    private String origen;
    private boolean hablaHumano;

    public Loro(String nombre, int edad, String estado, java.time.LocalDate fechaNacimiento,
                String pico, boolean vuela,
                String origen, boolean hablaHumano) {

        super(nombre, edad, estado, fechaNacimiento, pico, vuela);
        this.origen = origen;
        this.hablaHumano = hablaHumano;
    }

    @Override
    public void muestra() {
        System.out.println(this.toString() +
                ", Pico: " + pico +
                ", Vuela: " + vuela +
                ", Origen: " + origen +
                ", Habla humano: " + hablaHumano);
    }

    @Override
    public void morir() {
        this.estado = "Muerto";
        System.out.println(nombre + " ha muerto.");
    }

    @Override
    public void habla() {
        if (hablaHumano) {
            System.out.println(nombre + " dice: Hola humano!");
        } else {
            System.out.println(nombre + " hace sonidos.");
        }
    }

    public String getOrigen() { return origen; }
    public void setOrigen(String origen) { this.origen = origen; }

    public boolean isHablaHumano() { return hablaHumano; }
    public void setHablaHumano(boolean hablaHumano) { this.hablaHumano = hablaHumano; }
}