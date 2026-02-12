package Unidad2.AABoletinHerencias1;

import java.util.Objects;

public class Camion extends Vehiculo {

    int tonelajeKilos;
    int numPasajeros;
    int numEjes;

    public String[] getLicencias() {

        if (numPasajeros > 9) {
            return new String[0]; // No válido con carnet C
        }

        if (tonelajeKilos > 3500 && tonelajeKilos <= 7500) {
            return new String[]{"C1"};
        }

        if (tonelajeKilos > 7500) {
            return new String[]{"C"};
        }

        return new String[0];
    }



    public Camion(String duenyo, int numPuertas, int numVehiculos, int tonelajeKilos, int numPasajeros, int numEjes) {
        super(duenyo, numPuertas, numVehiculos);
        this.tonelajeKilos = tonelajeKilos;
        this.numPasajeros = numPasajeros;
        this.numEjes = numEjes;
    }

    @Override
    public String toString() {
        return "Camion{" +
                "tonelajeKilos=" + tonelajeKilos +
                ", numPasajeros=" + numPasajeros +
                ", numEjes=" + numEjes +
                ", duenyo='" + getDuenyo() + '\'' +
                ", numPuertas=" + getNumPuertas() +
                ", numVehiculos=" + getNumRuedas() +
                '}';
    }

    public int getTonelajeKilos() {
        return tonelajeKilos;
    }

    public void setTonelajeKilos(int tonelajeKilos) {
        this.tonelajeKilos = tonelajeKilos;
    }

    public int getNumPasajeros() {
        return numPasajeros;
    }

    public void setNumPasajeros(int numPasajeros) {
        this.numPasajeros = numPasajeros;
    }

    public int getNumEjes() {
        return numEjes;
    }

    public void setNumEjes(int numEjes) {
        this.numEjes = numEjes;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Camion camion = (Camion) o;
        return tonelajeKilos == camion.tonelajeKilos && numPasajeros == camion.numPasajeros && numEjes == camion.numEjes;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), tonelajeKilos, numPasajeros, numEjes);
    }
}