package Unidad2.AAOrientacionObjetoIntroduccion;

public class Ejercicio3Notas {

    String nombreAsignatura;
    int nota1Trimestre;
    int nota2Trimestre;
    int nota3Trimestre;

    public int notaMedia() {

        int notaMedia = 0;

        notaMedia += (nota1Trimestre + nota2Trimestre + nota3Trimestre) / 3;

        return notaMedia;
    }

    int trimestresAprobados() {

        int numeroTrimestresAprobados = 0;

        if (nota1Trimestre >= 5) {
            numeroTrimestresAprobados++;
        }

        else if (nota2Trimestre >= 5) {
            numeroTrimestresAprobados++;
        }

        else if (nota3Trimestre >= 5) {
            numeroTrimestresAprobados++;
        }

        return numeroTrimestresAprobados;
    }

    public Ejercicio3Notas(String nombreAsignatura, int nota1Trimestre, int nota2Trimestre, int nota3Trimestre) {
        this.nombreAsignatura = nombreAsignatura;
        this.nota1Trimestre = nota1Trimestre;
        this.nota2Trimestre = nota2Trimestre;
        this.nota3Trimestre = nota3Trimestre;
    }

    @Override
    public String toString() {
        return "Ejercicio3Notas{" +
                "nombreAsignatura='" + nombreAsignatura + '\'' +
                ", nota1Trimestre=" + nota1Trimestre +
                ", nota2Trimestre=" + nota2Trimestre +
                ", nota3Trimestre=" + nota3Trimestre +
                '}';
    }
}
