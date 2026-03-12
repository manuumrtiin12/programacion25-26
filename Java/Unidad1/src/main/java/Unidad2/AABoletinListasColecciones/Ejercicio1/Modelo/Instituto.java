package main.java.Unidad2.AABoletinListasColecciones.Ejercicio1.Modelo;

import java.util.List;
import java.util.Objects;

public class Instituto {

    private List<Grupo> grupos;

    public void agregarGrupo(Grupo g) {

        grupos.add(g);
    }

    public void mostrarEstudiantesPorGrupo(String descripcion) {

        for (Grupo g : grupos) {

            if (g.getDescripcion().equalsIgnoreCase(descripcion)) {

                for (Estudiante e : g.getEstudiantes()) {
                    System.out.println("Nombre: " + e.getNombre());
                    System.out.println("ID: " + e.getId());
                    System.out.println("Notas: " + e.getNotas());
                    System.out.println("----------------------");
                }

                return;
            }
        }

        System.out.println("No existe un grupo con esa descripción.");
    }

    public void mostrarInfoGrupo(String descripcion) {

        for (Grupo g : grupos) {

            if (g.getDescripcion().equalsIgnoreCase(descripcion)) {

                System.out.println("Descripcion: " + g.getDescripcion());
                System.out.println("Tutor: " + g.getTutor());
                System.out.println("Numero de estudiantes: " + g.getEstudiantes().size());
                System.out.println("Aula: " + g.getAula());

                return;
            }
        }

        System.out.println("No existe un grupo con esa descripción.");
    }

    public double calcularPromedioGrupo(String descripcion) {

        for (Grupo g : grupos) {

            if (g.getDescripcion().equalsIgnoreCase(descripcion)) {

                return g.calcularPromedioGrupo();
            }
        }

        System.out.println("No existe un grupo con esa descripción.");
        return 0;
    }


    public Instituto(List<Grupo> grupos) {
        this.grupos = grupos;
    }

    public List<Grupo> getGrupos() {
        return grupos;
    }

    public void setGrupos(List<Grupo> grupos) {
        this.grupos = grupos;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Instituto instituto = (Instituto) o;
        return Objects.equals(grupos, instituto.grupos);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(grupos);
    }

    @Override
    public String toString() {
        return "Instituto{" +
                "grupos=" + grupos +
                '}';
    }
}
