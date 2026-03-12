package main.java.Unidad2.AABoletinListasColecciones.Ejercicio1.Modelo;

import java.util.ArrayList;
import java.util.List;

public class Horario {

    private List<Dia> dias;

    public Horario() {
        dias = new ArrayList<>();
    }

    public void agregarDia(Dia d) {
        if (dias.size() < 5) {
            dias.add(d);
        }
    }

    public Dia obtenerDia(String nombre) {

        for (Dia d : dias) {
            if (d.getNombre().equalsIgnoreCase(nombre)) {
                return d;
            }
        }

        return null;
    }

    public List<Dia> getDias() {
        return dias;
    }

    public void setDias(List<Dia> dias) {
        this.dias = dias;
    }

    @Override
    public String toString() {
        return "Horario{" +
                "dias=" + dias +
                '}';
    }
}