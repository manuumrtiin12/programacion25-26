package main.java.Unidad2.AABoletinListasColecciones.Ejercicio1.Modelo;

import java.util.List;
import java.util.Objects;

public class Grupo {

    private int identificador;
    private String descripcion;
    private String tutor;
    private String aula;
    private List<Estudiante> estudiantes;
    private Horario horario;

    public Grupo(int identificador, String descripcion, String tutor, String aula, List<Estudiante> estudiantes, Horario horario) {
        this.identificador = identificador;
        this.descripcion = descripcion;
        this.tutor = tutor;
        this.aula = aula;
        this.estudiantes = estudiantes;
        this.horario = horario;
    }

    public void agregarEstudiante(Estudiante e) {
        estudiantes.add(e);
    }

    public void mostrarEstudiantes() {
        for (Estudiante e : estudiantes) {
            System.out.println(e);
        }
    }

    public double calcularPromedioGrupo() {

        if (estudiantes.isEmpty()) {
            return 0;
        }

        double suma = 0;

        for (Estudiante e : estudiantes) {
            suma += e.calcularPromedio();
        }

        return suma / estudiantes.size();
    }

    public int obtenerNumeroEstudiantes() {
        return estudiantes.size();
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTutor() {
        return tutor;
    }

    public void setTutor(String tutor) {
        this.tutor = tutor;
    }

    public String getAula() {
        return aula;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public Horario getHorario() {
        return horario;
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Grupo grupo = (Grupo) o;
        return identificador == grupo.identificador;
    }

    @Override
    public int hashCode() {
        return Objects.hash(identificador);
    }

    @Override
    public String toString() {
        return "Grupo{" +
                "identificador=" + identificador +
                ", descripcion='" + descripcion + '\'' +
                ", tutor='" + tutor + '\'' +
                ", aula='" + aula + '\'' +
                ", estudiantes=" + estudiantes +
                '}';
    }
}