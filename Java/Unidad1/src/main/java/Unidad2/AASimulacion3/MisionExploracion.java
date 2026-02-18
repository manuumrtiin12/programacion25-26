package main.java.Unidad2.AASimulacion3;

import java.time.LocalDate;
import java.util.Objects;

public class MisionExploracion extends Mision{

    private String destino;
    private int tamañoTripulacion;

    @Override
    public boolean misionDeRiesgo() {

        boolean riesgo = false;

        if (this.destino == "marte" || getFechaLanzamiento() == LocalDate.now().plusDays(7)) {
            riesgo = true;
        }

        return riesgo;
    }

    public MisionExploracion(String id, String nombreClave, LocalDate fechaLanzamiento, String naveAsignada, EstadoMision estado) {
        super(id, nombreClave, fechaLanzamiento, naveAsignada, estado);
    }

    @Override
    public String toString() {
        return "MisionExploracion{" +
                "id='" + getId() + '\'' +
                ", nombreClave='" + getNombreClave() + '\'' +
                ", fechaLanzamiento=" + getFechaLanzamiento() +
                ", naveAsignada='" + getNaveAsignada() + '\'' +
                ", estado=" + getEstado() +
                '}';
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getTamañoTripulacion() {
        return tamañoTripulacion;
    }

    public void setTamañoTripulacion(int tamañoTripulacion) {
        this.tamañoTripulacion = tamañoTripulacion;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        MisionExploracion that = (MisionExploracion) o;
        return tamañoTripulacion == that.tamañoTripulacion && Objects.equals(destino, that.destino);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), destino, tamañoTripulacion);
    }
}
