package main.java.Unidad2.AABoletinInterfaces1.Ejercicio2.Modelo;

public class Libro extends RecursosPrestar {

    private String autor;
    private String editorial;
    private String generoLiterario;

    public Libro(String autor, String editorial, String generoLiterario,
                 int unidadesTotales) {

        super(unidadesTotales);
        this.autor = autor;
        this.editorial = editorial;
        this.generoLiterario = generoLiterario;
    }

    @Override
    public boolean estaDisponible() {
        boolean disponible = false;

        if (getUnidadesPrestadas() < getUnidadesTotales()) {
            disponible = true;
        }

        return disponible;
    }

    @Override
    public int getDevuelveDiasPrestamo() {
        return 21;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getGeneroLiterario() {
        return generoLiterario;
    }

    public void setGeneroLiterario(String generoLiterario) {
        this.generoLiterario = generoLiterario;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "autor='" + getAutor() + '\'' +
                ", editorial='" + getEditorial() + '\'' +
                ", generoLiterario='" + getGeneroLiterario() + '\'' +
                ", unidadesTotales=" + getUnidadesTotales() +
                ", unidadesPrestadas=" + getUnidadesPrestadas() +
                '}';
    }
}