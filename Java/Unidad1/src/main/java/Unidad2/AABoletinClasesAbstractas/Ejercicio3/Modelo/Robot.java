package main.java.Unidad2.AABoletinClasesAbstractas.Ejercicio3.Modelo;

import java.util.Objects;

public abstract class Robot {

    private int id;
    private int contador = 0;
    private String modelo;
    private int bateria;
    private EstadoRobot estado;
    private String combustible;
    private String descripcion;

    public abstract void ejecutaTarea();
    public abstract boolean recargar();

    public void verificaBateria() {

        if (this.bateria > 10) {
            System.out.println("La bateria es suficiente");
        }

        else {
            System.out.println("La bateria no es suficiente");
        }
    }

    public Robot(int id, int contador, String modelo, int bateria, EstadoRobot estado, String combustible, String descripcion) {
        this.id = id;
        this.contador = contador;
        this.modelo = modelo;
        this.bateria = bateria;
        this.estado = estado;
        this.combustible = combustible;
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getBateria() {
        return bateria;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
    }

    public EstadoRobot getEstado() {
        return estado;
    }

    public void setEstado(EstadoRobot estado) {
        this.estado = estado;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Robot robot = (Robot) o;
        return id == robot.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Robot{" +
                "id=" + id +
                ", modelo='" + modelo + '\'' +
                ", bateria=" + bateria +
                ", estado=" + estado +
                '}';
    }


}
