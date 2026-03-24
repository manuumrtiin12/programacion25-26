package main.java.Unidad2.AABoletinClone.Ejercicio2.Modelo;

import java.util.Objects;

public class Motor implements Cloneable{

    private TipoCombustible combustible;
    private int cv;
    private boolean enMarcha;

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public Motor(TipoCombustible combustible, int cv, boolean enMarcha) {
        this.combustible = combustible;
        this.cv = cv;
        this.enMarcha = enMarcha;
    }

    public TipoCombustible getCombustible() {
        return combustible;
    }

    public void setCombustible(TipoCombustible combustible) {
        this.combustible = combustible;
    }

    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }

    public boolean isEnMarcha() {
        return enMarcha;
    }

    public void setEnMarcha(boolean enMarcha) {
        this.enMarcha = enMarcha;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Motor motor = (Motor) o;
        return cv == motor.cv && enMarcha == motor.enMarcha && combustible == motor.combustible;
    }

    @Override
    public int hashCode() {
        return Objects.hash(combustible, cv, enMarcha);
    }

    @Override
    public String toString() {
        return "Motor{" +
                "combustible=" + getCombustible() +
                ", cv=" + getCv() +
                ", enMarcha=" + isEnMarcha() +
                '}';
    }
}
