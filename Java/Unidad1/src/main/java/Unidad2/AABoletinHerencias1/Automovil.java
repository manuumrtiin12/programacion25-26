package main.java.Unidad2.AABoletinHerencias1;

import java.util.Objects;

public class Automovil extends Vehiculo{

    private String calificacionEcologica;


    public boolean tienePermisoParaCircular(String ciudad) {

        boolean puede = false;

        if (ciudad.equals(this.calificacionEcologica)) {
            puede = true;
        }
        return puede;

    }

    public Automovil(String duenyo, int numPuertas, int numVehiculos, String calificacionEcologica) {
        super(duenyo, numPuertas, numVehiculos);
        this.calificacionEcologica = calificacionEcologica;
    }

    @Override
    public String toString() {
        return "Automovil{" +
                "calificacionEcologica='" + calificacionEcologica + '\'' +
                ", duenyo='" + getDuenyo() + '\'' +
                ", numPuertas=" + getNumPuertas() +
                ", numVehiculos=" + getNumVehiculos() +
                '}';
    }

    public String getCalificacionEcologica() {
        return calificacionEcologica;
    }

    public void setCalificacionEcologica(String calificacionEcologica) {
        this.calificacionEcologica = calificacionEcologica;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Automovil automovil = (Automovil) o;
        return Objects.equals(calificacionEcologica, automovil.calificacionEcologica);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), calificacionEcologica);
    }

}
