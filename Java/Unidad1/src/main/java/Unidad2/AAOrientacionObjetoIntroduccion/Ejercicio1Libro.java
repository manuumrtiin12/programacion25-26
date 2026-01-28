package main.java.Unidad2.AAOrientacionObjetoIntroduccion;

public class Ejercicio1Libro {

    String isbn;
    String titulo;
    String autor;
    int numPaginas;

    public void imprimeLibro() {
        System.out.println("Libro: " + titulo + " Numero de paginas: " + numPaginas);
    }

    public Ejercicio1Libro(String isbn, String titulo, String autor, int numPaginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return "Ejercicio1Libro{" +
                "isbn='" + isbn + '\'' +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", numPaginas=" + numPaginas +
                '}';
    }
}
