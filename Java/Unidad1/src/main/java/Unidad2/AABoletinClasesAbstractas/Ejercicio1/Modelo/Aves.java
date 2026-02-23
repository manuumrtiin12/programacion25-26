package main.java.Unidad2.AABoletinClasesAbstractas.Ejercicio1.Modelo;

public abstract class Aves extends Mascotas {

    protected String pico;
    protected boolean vuela;

    public Aves(String nombre, int edad, String estado, java.time.LocalDate fechaNacimiento,
                String pico, boolean vuela) {
        this.nombre = nombre;
        this.edad = edad;
        this.estado = estado;
        this.fechaNacimiento = fechaNacimiento;
        this.pico = pico;
        this.vuela = vuela;
    }

    public void volar() {
        if (vuela) {
            System.out.println(nombre + " está volando.");
        } else {
            System.out.println(nombre + " no puede volar.");
        }
    }

    public String getPico() { return pico; }
    public void setPico(String pico) { this.pico = pico; }

    public boolean isVuela() { return vuela; }
    public void setVuela(boolean vuela) { this.vuela = vuela; }
}