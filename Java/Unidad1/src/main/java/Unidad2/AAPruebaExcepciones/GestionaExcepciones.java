package main.java.Unidad2.AAPruebaExcepciones;

public class GestionaExcepciones {

    public void main(String[] args) {

        try {
            GrupoAlumnos grupo = new GrupoAlumnos(new String[2], new String[2]);
        } catch (ClassNotFoundException e) {
            System.out.println("A ocurrido una excepcion: " + e.getMessage());
        }

        finally {
            System.out.println("Entra en el finally");
        }
        System.out.println("Sigo con mi tarea");


    }
}
