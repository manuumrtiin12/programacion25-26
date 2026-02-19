package Unidad2.AAEjercicioEjemploInterfaces;

public abstract class SerVivo {

    private int edad;

    abstract boolean estaVivo();
    abstract boolean seDesplaza();


    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
