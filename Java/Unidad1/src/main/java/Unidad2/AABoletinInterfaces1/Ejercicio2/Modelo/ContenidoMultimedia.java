package main.java.Unidad2.AABoletinInterfaces1.Ejercicio2.Modelo;

public class ContenidoMultimedia extends RecursosPrestar {

    private String nombre;
    private String genero;
    private int duracionMinutos;
    private int numeroFases;
    private String tipo;

    public ContenidoMultimedia(String nombre, String genero, String tipo, int unidadesTotales) {
        super(unidadesTotales);
        this.nombre = nombre;
        this.genero = genero;
        this.tipo = tipo.toLowerCase();
        this.duracionMinutos = 0;
        this.numeroFases = 0;
    }

    @Override
    public boolean estaDisponible() {
        return getUnidadesPrestadas() < getUnidadesTotales();
    }

    @Override
    public int getDevuelveDiasPrestamo() {
        return 10;
    }

    public void setDuracionMinutos(int duracion) {
        if (tipo.equals("pelicula") || tipo.equals("audio")) {
            this.duracionMinutos = duracion;
        }
    }

    public int getDuracionMinutos() {
        if (tipo.equals("pelicula") || tipo.equals("audio")) {
            return duracionMinutos;
        } else {
            return -1;
        }
    }

    public void setNumeroFases(int fases) {
        if (tipo.equals("juego")) {
            this.numeroFases = fases;
        }
    }

    public int getNumeroFases() {
        if (tipo.equals("juego")) {
            return numeroFases;
        } else {
            return -1;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTipo() {
        return tipo;
    }
}