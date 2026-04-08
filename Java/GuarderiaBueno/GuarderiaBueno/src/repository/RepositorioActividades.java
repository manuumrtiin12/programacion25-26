package repository;

import java.time.LocalDate;
import java.util.*;

import exceptions.GuarderiaException;
import models.*;

public class RepositorioActividades {
    private Collection<Actividad> activididades;

    public RepositorioActividades() {
        super();
        this.activididades = new HashSet<Actividad>();
        //Uso un hashset porque no repetidos y no me dicen que guarde ordenado
    }

    public Collection<Actividad> getActivididades() {
        return activididades;
    }

    public void setActivididades(Set<Actividad> activididades) {
        this.activididades = activididades;
    }

    public boolean isAlumnoApuntado(String nombreActividad, LocalDate fechaActividad, Alumno a) throws GuarderiaException {
        boolean esta = false;
        // TODO

        return esta;
    }

    public void agregarAlumnoActividad(String nombreActividad, LocalDate fechaActividad, Alumno a)
            throws GuarderiaException {

        Actividad actividadRecibida = new Actividad(nombreActividad ,fechaActividad);
        Iterator<Actividad> it = this.activididades.iterator();
        boolean encontrado = false;
        Actividad tipo = null;
        while (it.hasNext() && encontrado){
            tipo = it.next();
            if (tipo.equals(actividadRecibida)){
                encontrado = true;
            }
        }
        if(!encontrado){
            tipo.agregarAlumno(a);
        }

    }

    public List<Alumno> getAlumnadoConAlergias(String nombreActividad, LocalDate fechaActividad) {
        List<Alumno> alergias = null;

        // TODO
        return alergias;
    }


    public List<Actividad> getListaActividades() {
        List<Actividad> actividades = null;

        // TODO
        return actividades;
    }

}
