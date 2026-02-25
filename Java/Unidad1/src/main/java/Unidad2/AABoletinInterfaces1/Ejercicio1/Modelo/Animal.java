package main.java.Unidad2.AABoletinInterfaces1.Ejercicio1.Modelo;

import java.util.Arrays;
import java.util.Objects;

public abstract class Animal implements CadenaAlimenticia{

    private String nombreEspecie;
    private String lugarHabita;
    private Animal [] animalesCome;
    private Animal [] animalesEsComido;

    public Animal(String nombreEspecie, String lugarHabita, Animal[] animalesCome, Animal[] animalesEsComido) {
        this.nombreEspecie = nombreEspecie;
        this.lugarHabita = lugarHabita;
        this.animalesCome = animalesCome;
        this.animalesEsComido = animalesEsComido;
    }

    public String getNombreEspecie() {
        return nombreEspecie;
    }

    public void setNombreEspecie(String nombreEspecie) {
        this.nombreEspecie = nombreEspecie;
    }

    public String getLugarHabita() {
        return lugarHabita;
    }

    public void setLugarHabita(String lugarHabita) {
        this.lugarHabita = lugarHabita;
    }

    public Animal[] getAnimalesCome() {
        return animalesCome;
    }

    public void setAnimalesCome(Animal[] animalesCome) {
        this.animalesCome = animalesCome;
    }

    public Animal[] getAnimalesEsComido() {
        return animalesEsComido;
    }

    public void setAnimalesEsComido(Animal[] animalesEsComido) {
        this.animalesEsComido = animalesEsComido;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(nombreEspecie, animal.nombreEspecie) && Objects.equals(lugarHabita, animal.lugarHabita) && Objects.deepEquals(animalesCome, animal.animalesCome) && Objects.deepEquals(animalesEsComido, animal.animalesEsComido);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombreEspecie, lugarHabita, Arrays.hashCode(animalesCome), Arrays.hashCode(animalesEsComido));
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nombreEspecie='" + getNombreEspecie() + '\'' +
                ", lugarHabita='" + getLugarHabita() + '\'' +
                ", animalesCome=" + Arrays.toString(getAnimalesCome()) +
                ", animalesEsComido=" + Arrays.toString(getAnimalesEsComido()) +
                '}';
    }
}
