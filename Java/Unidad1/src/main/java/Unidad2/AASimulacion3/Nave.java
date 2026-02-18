package main.java.Unidad2.AASimulacion3;

import java.util.Objects;

public class Nave {

    private String id;
    private String modelo;
    private int horasVuelo;

    public Nave(String id, String modelo, int horasVuelo) {
        this.id = id;
        this.modelo = modelo;
        this.horasVuelo = horasVuelo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getHorasVuelo() {
        return horasVuelo;
    }

    public void setHorasVuelo(int horasVuelo) {
        this.horasVuelo = horasVuelo;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Nave nave = (Nave) o;
        return Objects.equals(id, nave.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Nave{" +
                "id='" + getId() + '\'' +
                ", modelo='" + getModelo() + '\'' +
                ", horasVuelo=" + getHorasVuelo() +
                '}';
    }
}
