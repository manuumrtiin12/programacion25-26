package org.example.Modelo;

import java.util.Arrays;

public class Tactico extends PersonajeJugable{

    private static int contador = 0;
    private int codigoOperador;
    private Mapa[] mapaVentaja;


    @Override
    public Rangos getRangoCompetitivo() {

        if (getNivelMaestria() >= 80) {
            return Rangos.RANGO_RADIANTE;
        }

        else {return Rangos.RANGO_PLATINO;}

    }

    public void addMapaVentaja(Mapa mapAñadir) {

        int i = 0;

        while(i < mapaVentaja.length) {

            if (mapaVentaja[i] == null) {
                mapaVentaja[i] = mapAñadir;
                i = 9;
            }
            i++;
        }
    }

    public Tactico(String idAlias, int nivelMaestria, Mapa[] mapaVentaja) {
        super(idAlias, nivelMaestria);
        contador++;
        this.codigoOperador = contador;
        this.mapaVentaja = mapaVentaja;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public int getCodigoOperador() {
        return codigoOperador;
    }

    public void setCodigoOperador(int codigoOperador) {
        this.codigoOperador = codigoOperador;
    }

    public Mapa[] getMapaVentaja() {
        return mapaVentaja;
    }

    public void setMapaVentaja(Mapa[] mapaVentaja) {
        this.mapaVentaja = mapaVentaja;
    }

    @Override
    public String toString() {
        return "Tactico{" +
                " codigoOperador=" + getCodigoOperador() +
                ", mapaVentaja=" + Arrays.toString(getMapaVentaja()) +
                ", idAlias='" + getIdAlias() + '\'' +
                ", nivelMaestria=" + getNivelMaestria() +
                ", fechaDesbloqueo=" + getFechaDesbloqueo() +
                '}';
    }
}



