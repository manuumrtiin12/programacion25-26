package main.java.Unidad2.AABoletinClasesAbstractas.Ejercicio1.Modelo;

public class Perro extends Mascotas {

    private String raza;
    private boolean pulgas;

    public Perro(String nombre, int edad, String estado, java.time.LocalDate fechaNacimiento,
                 String raza, boolean pulgas) {
        this.nombre = nombre;
        this.edad = edad;
        this.estado = estado;
        this.fechaNacimiento = fechaNacimiento;
        this.raza = raza;
        this.pulgas = pulgas;
    }

    @Override
    public void muestra() {
        System.out.println(this.toString() +
                ", Raza: " + raza +
                ", Pulgas: " + pulgas);
    }

    @Override
    public void morir() {
        this.estado = "Muerto";
        System.out.println(nombre + " ha muerto.");
    }

    @Override
    public void habla() {
        System.out.println(nombre + " dice: Guau Guau");
    }

    // Getters y Setters
    public String getRaza() { return raza; }
    public void setRaza(String raza) { this.raza = raza; }

    public boolean isPulgas() { return pulgas; }
    public void setPulgas(boolean pulgas) { this.pulgas = pulgas; }
}