package main.java.Unidad2.AAPruebaExcepciones;

public class GrupoAlumnos {

    private String[] nombre;
    private String[] apellidos;

    public GrupoAlumnos(String[] nombre, String[] apellidos) throws ClassNotFoundException {
        this.setNombre(nombre);
        this.setApellidos(apellidos);
    }

    public GrupoAlumnos() {
        nombre = new String[20];
        apellidos = new String[20];
    }

    public String[] getNombre() {
        return nombre;
    }

    public void setNombre(String[] nombre) {

        if (nombre.length > 20) {

            //Lanzo Excepcion
            throw new NullPointerException("Llegan mas de 20 Nombres");
        }

        System.out.println("Llego a asignacion de nombres");
        this.nombre = nombre;
    }

    public String[] getApellidos() {
        return apellidos;
    }

    public void setApellidos(String[] apellidos) throws ClassNotFoundException {

        if (apellidos.length > 20) {
            throw new ClassNotFoundException("Llegan mas de 20 Apellidos");
        }
        System.out.println("Llego a asignacion de apellidos");

        this.apellidos = apellidos;
    }
}
