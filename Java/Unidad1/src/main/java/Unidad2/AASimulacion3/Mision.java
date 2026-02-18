package Unidad2.AASimulacion3;

import java.time.LocalDate;
import java.util.Objects;

public abstract class Mision {

    private String id;
    private String nombreClave;
    private LocalDate fechaLanzamiento;
    private String naveAsignada;
    private EstadoMision estado;

    public abstract void misionGeneral();

    public boolean verificaFecha() {

        boolean verificada = false;
        
        if (this.fechaLanzamiento )

        return verificada;
    }

    public Mision(String id, String nombreClave, LocalDate fechaLanzamiento, String naveAsignada, EstadoMision estado) {
        this.id = id;
        this.nombreClave = nombreClave;
        this.fechaLanzamiento = fechaLanzamiento;
        this.naveAsignada = naveAsignada;
        this.estado = EstadoMision.PLANIFICADA;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombreClave() {
        return nombreClave;
    }

    public void setNombreClave(String nombreClave) {
        this.nombreClave = nombreClave;
    }

    public LocalDate getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public void setFechaLanzamiento(LocalDate fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public String getNaveAsignada() {
        return naveAsignada;
    }

    public void setNaveAsignada(String naveAsignada) {
        this.naveAsignada = naveAsignada;
    }

    public EstadoMision getEstado() {
        return estado;
    }

    public void setEstado(EstadoMision estado) {
        this.estado = estado;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Mision mision = (Mision) o;
        return Objects.equals(id, mision.id) && Objects.equals(nombreClave, mision.nombreClave) && Objects.equals(fechaLanzamiento, mision.fechaLanzamiento) && Objects.equals(naveAsignada, mision.naveAsignada) && estado == mision.estado;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombreClave, fechaLanzamiento, naveAsignada, estado);
    }

    @Override
    public String toString() {
        return "Mision{" +
                "id='" + getId() + '\'' +
                ", nombreClave='" + getNombreClave() + '\'' +
                ", fechaLanzamiento=" + getFechaLanzamiento() +
                ", naveAsignada='" + getNaveAsignada() + '\'' +
                ", estado=" + getEstado() +
                '}';
    }
}
