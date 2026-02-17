package main.java.Unidad2.AASimulacion2;

import java.util.Objects;

public class Incidencia { 

    private int id;
    private String nombre;
    private String descripcion;
    private String fechaRegistro;
    private String fechaSolucion;
    private EstadoIncidencia Estado;
    private CriticidadIncidencia criticidad;
    private Equipo equipo;

    public void esUrgente() {

        if (this.criticidad == CriticidadIncidencia.CRITICA) {
            System.out.println("¡Solucionar incidencia con urgencia! ");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Incidencia that = (Incidencia) o;
        return id == that.id && Objects.equals(nombre, that.nombre) && Objects.equals(descripcion, that.descripcion) && Objects.equals(fechaRegistro, that.fechaRegistro) && Objects.equals(fechaSolucion, that.fechaSolucion) && Estado == that.Estado && criticidad == that.criticidad && Objects.equals(equipo, that.equipo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, descripcion, fechaRegistro, fechaSolucion, Estado, criticidad, equipo);
    }

    public Incidencia(int id, String nombreEquipo, String descripcion, String fechaRegistro, String fechaSolucion, EstadoIncidencia estado, CriticidadIncidencia criticidad, Equipo equipo) {
        this.id = id;
        this.nombre = nombreEquipo;
        this.descripcion = descripcion;
        this.fechaRegistro = fechaRegistro;
        this.fechaSolucion = fechaSolucion;
        Estado = estado;
        this.criticidad = criticidad;
        this.equipo = equipo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public String getFechaSolucion() {
        return fechaSolucion;
    }

    public void setFechaSolucion(String fechaSolucion) {
        this.fechaSolucion = fechaSolucion;
    }

    public EstadoIncidencia getEstado() {
        return Estado;
    }

    public void setEstado(EstadoIncidencia estado) {
        Estado = estado;
    }

    public CriticidadIncidencia getCriticidad() {
        return criticidad;
    }

    public void setCriticidad(CriticidadIncidencia criticidad) {
        this.criticidad = criticidad;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    @Override
    public String toString() {
        return getNombre() + " - Estado: " + getCriticidad() + " - " + getFechaRegistro() + " - " + equipo.getNombre();
    }
}
