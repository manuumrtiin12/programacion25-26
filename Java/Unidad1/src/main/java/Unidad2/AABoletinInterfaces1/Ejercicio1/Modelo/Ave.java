package main.java.Unidad2.AABoletinInterfaces1.Ejercicio1.Modelo;

public class Ave extends Animal{
    @Override
    public boolean atacar(Animal a) {
        return false;
    }

    @Override
    public boolean huir(Animal a) {
        return false;
    }

    public Ave(String nombreEspecie, String lugarHabita, Animal[] animalesCome, Animal[] animalesEsComido) {
        super(nombreEspecie, lugarHabita, new Animal[10], new Animal[10]);
    }
}
