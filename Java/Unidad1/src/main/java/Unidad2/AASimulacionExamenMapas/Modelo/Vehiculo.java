package main.java.Unidad2.AASimulacionExamenMapas.Modelo;


import java.time.LocalDate;
import java.util.Objects;

public class Vehiculo {

    private String numeroBastidor;
    private String numeroMatricula;
    private String marca;
    private String modelo;
    private LocalDate fechaMatriculacion;
    private String propietarioActual;


    public Vehiculo(String numeroBastidor, String numeroMatricula, String marca, String modelo, LocalDate fechaMatriculacion, String propietarioActual) {
        this.numeroBastidor = numeroBastidor;
        this.numeroMatricula = numeroMatricula;
        this.marca = marca;
        this.modelo = modelo;
        this.fechaMatriculacion = fechaMatriculacion;
        this.propietarioActual = propietarioActual;
    }


    public String getNumeroBastidor() {
        return numeroBastidor;
    }

    public void setNumeroBastidor(String numeroBastidor) {
        this.numeroBastidor = numeroBastidor;
    }

    public String getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(String numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public LocalDate getFechaMatriculacion() {
        return fechaMatriculacion;
    }

    public void setFechaMatriculacion(LocalDate fechaMatriculacion) {
        this.fechaMatriculacion = fechaMatriculacion;
    }

    public String getPropietarioActual() {
        return propietarioActual;
    }

    public void setPropietarioActual(String propietarioActual) {
        this.propietarioActual = propietarioActual;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Vehiculo vehiculo = (Vehiculo) o;
        return Objects.equals(numeroBastidor, vehiculo.numeroBastidor);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(numeroBastidor);
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "numeroBastidor='" + getNumeroBastidor() + '\'' +
                ", numeroMatricula='" + getNumeroMatricula() + '\'' +
                ", marca='" + getMarca() + '\'' +
                ", modelo='" + getModelo() + '\'' +
                ", fechaMatriculacion=" + getFechaMatriculacion() +
                ", propietarioActual='" + getPropietarioActual() + '\'' +
                '}';
    }
}
