package Unidad2.AASimulacion3;

import java.time.LocalDate;
import java.util.Objects;

public class MisionLogistica extends Mision {

    private double carga;

    @Override
    public boolean misionDeRiesgo() {

        boolean riesgo = false;

        if (this.carga > 50 || getFechaLanzamiento().getDayOfWeek().getValue() >= 6) {

            riesgo = true;
        }

        return riesgo;
    }

    public MisionLogistica(String id, String nombreClave, LocalDate fechaLanzamiento, String naveAsignada, EstadoMision estado, double carga) {
        super(id, nombreClave, fechaLanzamiento, naveAsignada, estado);
        this.carga = carga;
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        MisionLogistica that = (MisionLogistica) o;
        return Double.compare(carga, that.carga) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), carga);
    }

    @Override
    public String toString() {
        return "MisionLogistica{" +
                "carga=" + carga +
                '}';
    }
}
