package Unidad2.Iniciacion_OrientacionObjeto;

public class Persona {

    String nombre;
    int edad;
    String lugarNacimiento;
    String deporteFav;
    String peliFav;

    //Constructores

    public Persona(String nombre, int edad, String lugarNacimiento, String deporteFav, String peliFav) {
        this.nombre = nombre;
        this.edad = edad;
        this.lugarNacimiento = lugarNacimiento;
        this.deporteFav = deporteFav;
        this.peliFav = peliFav;
    }

    public Persona() {
    }

    //Metodos

    void hablar(){
        System.out.println("hablando: " + nombre);
    }

    void comer(){
        System.out.println(nombre + " comiento melon");
    }

    boolean haRobado(){
        return false;}

    @Override
    public String toString() {
        return "Persona{" +
                "nombre=" + nombre +
                ", edad='" + edad + '\'' +
                ", lugarNacimiento='" + lugarNacimiento + '\'' +
                ", deporteFav='" + deporteFav + '\'' +
                ", peliFav='" + peliFav + '\'' +
                '}';
    }


}
