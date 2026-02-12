package Unidad2.AABoletinHerencias1;

import java.util.Objects;

public class Vehiculo {

    private String duenyo;
    private int numPuertas;
    private int numRuedas;



    public Vehiculo(String duenyo, int numPuertas, int numVehiculos) {
        this.duenyo = duenyo;
        this.numPuertas = numPuertas;
        this.numRuedas = numVehiculos;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "duenyo='" + duenyo + '\'' +
                ", numPuertas=" + numPuertas +
                ", numVehiculos=" + numRuedas +
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

    public int getNumRuedas() {
        return numRuedas;
    }

    public void setNumRuedas(int numRuedas) {
        this.numRuedas = numRuedas;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Vehiculo vehiculo = (Vehiculo) o;
        return numPuertas == vehiculo.numPuertas && numRuedas == vehiculo.numRuedas && Objects.equals(duenyo, vehiculo.duenyo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(duenyo, numPuertas, numRuedas);
    }
}