package main.java.Unidad2.AABoletinClone.Ejercicio2.Modelo;

import java.util.Objects;

public class Coche implements Cloneable{

    private String matricula;
    private String modelo;
    private int kilometraje;
    private Motor motor;

    @Override
    public Object clone() throws CloneNotSupportedException {
        Object objeto = super.clone();
        Coche c = (Coche) objeto;
        c.setMotor((Motor) c.getMotor().clone());
        return c;
    }

    public Coche(String matricula, String modelo, int kilometraje, Motor motor) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.kilometraje = kilometraje;
        this.motor = motor;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Coche coche = (Coche) o;
        return Objects.equals(matricula, coche.matricula);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(matricula);
    }

    @Override
    public String toString() {
        return "Coche{" +
                "matricula='" + getMatricula() + '\'' +
                ", modelo='" + getModelo() + '\'' +
                ", kilometraje=" + getKilometraje() +
                ", motor=" + getMotor() +
                '}';
    }
}
