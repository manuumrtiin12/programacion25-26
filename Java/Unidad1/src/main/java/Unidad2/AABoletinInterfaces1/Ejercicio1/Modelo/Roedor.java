package main.java.Unidad2.AABoletinInterfaces1.Ejercicio1.Modelo;

public class Roedor extends Animal {

    public Roedor(String nombreEspecie, String lugarHabita) {
        super(nombreEspecie, lugarHabita, new Animal[10], new Animal[10]
        );
    }

    @Override
    public boolean atacar(Animal a) {
        return false;
    }

    @Override
    public boolean huir(Animal a) {

        boolean huye = false;

        for (Animal depredador : this.getAnimalesEsComido()) {
            if (depredador != null && depredador.equals(a)) {
                huye = true;
            }
        }

        return huye ;
    }
}