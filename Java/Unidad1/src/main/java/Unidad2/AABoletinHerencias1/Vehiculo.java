package main.java.Unidad2.AABoletinHerencias1;

import java.util.Objects;

public class Vehiculo {

    private String duenyo;
    private int numPuertas;
    private int numVehiculos;



    public Vehiculo(String duenyo, int numPuertas, int numVehiculos) {
        this.duenyo = duenyo;
        this.numPuertas = numPuertas;
        this.numVehiculos = numVehiculos;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "duenyo='" + duenyo + '\'' +
                ", numPuertas=" + numPuertas +
                ", numVehiculos=" + numVehiculos +
                '}';
    }

    public String getDuenyo() {
        return duenyo;
    }

    public void setDuenyo(String duenyo) {
        this.duenyo = duenyo;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public int getNumVehiculos() {
        return numVehiculos;
    }

    public void setNumVehiculos(int numVehiculos) {
        this.numVehiculos = numVehiculos;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Vehiculo vehiculo = (Vehiculo) o;
        return numPuertas == vehiculo.numPuertas && numVehiculos == vehiculo.numVehiculos && Objects.equals(duenyo, vehiculo.duenyo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(duenyo, numPuertas, numVehiculos);
    }
}