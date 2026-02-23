package main.java.Unidad2.AABoletinClasesAbstractas.Ejercicio1.Modelo;

public class Gato extends Mascotas {

    private String color;
    private boolean peloLargo;

    public Gato(String nombre, int edad, String estado, java.time.LocalDate fechaNacimiento,
                String color, boolean peloLargo) {
        this.nombre = nombre;
        this.edad = edad;
        this.estado = estado;
        this.fechaNacimiento = fechaNacimiento;
        this.color = color;
        this.peloLargo = peloLargo;
    }

    @Override
    public void muestra() {
        System.out.println(this.toString() +
                ", Color: " + color +
                ", Pelo largo: " + peloLargo);
    }

    @Override
    public void morir() {
        this.estado = "Muerto";
        System.out.println(nombre + " ha muerto.");
    }

    @Override
    public void habla() {
        System.out.println(nombre + " dice: Miau");
    }

    // Getters y Setters
    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    public boolean isPeloLargo() { return peloLargo; }
    public void setPeloLargo(boolean peloLargo) { this.peloLargo = peloLargo; }
}