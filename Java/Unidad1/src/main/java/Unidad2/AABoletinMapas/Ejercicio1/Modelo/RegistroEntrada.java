package main.java.Unidad2.AABoletinMapas.Ejercicio1.Modelo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

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

    public void listarInfluencerConfirmados() {

        Set<Influencer> influencersConfirmados = new HashSet<Influencer>();
        Iterator <Map.Entry<Influencer, entradaVIP>> it = entradas.entrySet().iterator();

        while (it.hasNext()) {

            Map.Entry <Influencer, entradaVIP> pareja = it.next();

            if (pareja.getValue() != null && pareja.getValue().getEstadoEntrada().equals(EstadoEntrada.CONFIRMADA)) {

                influencersConfirmados.add(pareja.getKey());
            }

            System.out.println(influencersConfirmados);
        }
    }

    public void listarInfluencerCancelado() {

        Set<Influencer> influencersCancelados = new HashSet<Influencer>();
        Iterator <Map.Entry<Influencer, entradaVIP>> it = entradas.entrySet().iterator();

        while (it.hasNext()) {

            Map.Entry <Influencer, entradaVIP> pareja = it.next();

            if (pareja.getValue() != null && pareja.getValue().getEstadoEntrada().equals(EstadoEntrada.CANCELADA)) {

                influencersCancelados.add(pareja.getKey());
            }

            System.out.println(influencersCancelados);
        }
    }
}
