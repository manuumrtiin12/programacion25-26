package main.java.Unidad2.AABoletinColecciones.Ejercicio1.Modelo;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

public class RegistroEntrada {

    private Map<Influencer, entradaVIP> entradas;

    public void añadirEntrada(Influencer i, entradaVIP e) {

        entradas.put(i, e);
    }

    public entradaVIP buscarInfluencer(String nick, String plataforma) {

        entradaVIP entradaDevolver = null;

        Influencer in = new Influencer(null, nick, 0, plataforma);

        entradaDevolver = entradas.get(in);

        return entradaDevolver;
    }

    public void confirmarAsistencia(String nick, String plataforma) {

        entradaVIP entrada = null;

        Influencer in = new Influencer(null, nick, 0, plataforma);

        entrada = entradas.get(in);

        if (entrada != null) {

            entrada.setEstadoEntrada(EstadoEntrada.CONFIRMADA);
        }
    }

    public void cancelarAsistencia(String nick, String plataforma) {

        entradaVIP entrada = null;

        Influencer in = new Influencer(null, nick, 0, plataforma);

        entrada = entradas.get(in);

        if (entrada != null) {
            
            entrada.setEstadoEntrada(EstadoEntrada.CANCELADA);
        }
    }

    public void listarConfirmados() {}


}
