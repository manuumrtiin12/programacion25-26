package main.java.Unidad2.AASimulacion2;

import java.time.LocalDate;
import java.util.Objects;

public class Incidencia { 

    private int id;
    private String nombre;
    private String descripcion;
    private LocalDate fechaRegistro;
    private LocalDate fechaSolucion;
    private EstadoIncidencia estado;
    private CriticidadIncidencia criticidad;
    private Equipo equipo;

    public void esUrgente() {

        LocalDate hoy = LocalDate.now();

        if (criticidad == CriticidadIncidencia.CRITICA) {
            System.out.println("¡Solucionar incidencia con urgencia!");
        }

        else if (criticidad == CriticidadIncidencia.GRAVE &&
                !fechaRegistro.plusDays(7).isAfter(hoy)) {

            System.out.println("¡Solucionar incidencia con urgencia!");
        }

        else if (criticidad == CriticidadIncidencia.MEDIA &&
                !fechaRegistro.plusDays(30).isAfter(hoy)) {

            System.out.println("¡Solucionar incidencia con urgencia!");
        }

        else {
            System.out.println("La incidencia no es urgente.");
        }
    }


    public Incidencia(int id, String nombreEquipo, String descripcion, LocalDate fechaRegistro, LocalDate fechaSolucion, EstadoIncidencia estado, CriticidadIncidencia criticidad, Equipo equipo) {
        this.id = id;
        this.nombre = nombreEquipo;
        this.descripcion = descripcion;
        this.fechaRegistro = fechaRegistro.now();
        this.fechaSolucion = fechaSolucion;
        this.estado = estado;
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

    public LocalDate getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDate fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public LocalDate getFechaSolucion() {
        return fechaSolucion;
    }

    public void setFechaSolucion(LocalDate fechaSolucion) {
        this.fechaSolucion = fechaSolucion;
    }

    public EstadoIncidencia getEstado() {
        return estado;
    }

    public void setEstado(EstadoIncidencia estado) {
        this.estado = estado;
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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Incidencia that = (Incidencia) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
