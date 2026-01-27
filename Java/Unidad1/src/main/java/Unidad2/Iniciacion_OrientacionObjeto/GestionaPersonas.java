package Unidad2.Iniciacion_OrientacionObjeto;

public class GestionaPersonas {
    public void main(String[] args) {

        Persona paula = new Persona("paula", 21, "Cuenca", "Gimnasia Ritmica", "Avatar");

        System.out.println(paula.toString());
        paula.hablar();
        paula.comer();

        System.out.println("");

        Persona antonio = new Persona("Antonio", 19, "Benalmadena","Badminton" ,"El señor de los Anillos");

        System.out.println(antonio.toString());
        antonio.hablar();
        antonio.comer();
    }
}
