package Unidad2.AASimulacion3;

import java.time.LocalDate;

public class MisionExploracion extends Mision{

    private String destino;
    private int tamañoTripulacion;

    @Override
    public void misionGeneral() {

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
}
