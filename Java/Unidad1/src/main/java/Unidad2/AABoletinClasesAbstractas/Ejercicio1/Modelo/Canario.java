package main.java.Unidad2.AABoletinClasesAbstractas.Ejercicio1.Modelo;

public class Canario extends Aves {

    private String color;
    private boolean canta;

    public Canario(String nombre, int edad, String estado, java.time.LocalDate fechaNacimiento,
                   String pico, boolean vuela,
                   String color, boolean canta) {

        super(nombre, edad, estado, fechaNacimiento, pico, vuela);
        this.color = color;
        this.canta = canta;
    }

    @Override
    public void muestra() {
        System.out.println(this.toString() +
                ", Pico: " + pico +
                ", Vuela: " + vuela +
                ", Color: " + color +
                ", Canta: " + canta);
    }

    @Override
    public void morir() {
        this.estado = "Muerto";
        System.out.println(nombre + " ha muerto.");
    }

    @Override
    public void habla() {
        if (canta) {
            System.out.println(nombre + " está cantando 🎵");
        } else {
            System.out.println(nombre + " no está cantando.");
        }
    }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    public boolean isCanta() { return canta; }
    public void setCanta(boolean canta) { this.canta = canta; }
}