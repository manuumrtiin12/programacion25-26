package models;

import java.util.List;

public class Alumno {
    public static int numeroAlumnos;
    private int id;
    private String nombre;
    private String apellidos;
    private int edad;
    private String telefono;
    private List<String> alergias;
    private boolean autorizaImagenes;
    private Maestro maestro;


    public Alumno(String nombre, String apellidos, int edad, String telefono, List<String> alergias,
                  boolean autorizaImagenes, Maestro maestro) {
        super();
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.telefono = telefono;
        this.alergias = alergias;
        this.autorizaImagenes = autorizaImagenes;
        this.maestro = maestro;
        //TODO Asignar id autogenerado
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public List<String> getAlergias() {
        return alergias;
    }

    public void setAlergias(List<String> alergias) {
        this.alergias = alergias;
    }

    public boolean isAutorizaImagenes() {
        return autorizaImagenes;
    }

    public void setAutorizaImagenes(boolean autorizaImagenes) {
        this.autorizaImagenes = autorizaImagenes;
    }

    public Maestro getMaestro() {
        return maestro;
    }

    public void setMaestro(Maestro maestro) {
        this.maestro = maestro;
    }


}