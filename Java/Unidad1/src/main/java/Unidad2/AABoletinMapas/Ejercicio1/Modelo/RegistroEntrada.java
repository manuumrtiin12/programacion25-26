package main.java.Unidad2.AABoletinMapas.Ejercicio1.Modelo;

import java.util.*;

public class RegistroEntrada {

    private Map<Influencer, entradaVIP> entradas;

    public RegistroEntrada() {
        entradas = new HashMap<>();
    }

    public void añadirEntrada(Influencer i, entradaVIP e) {
        entradas.put(i, e);
    }

    public entradaVIP buscarInfluencer(String nick, String plataforma) {
        Influencer in = new Influencer(null, nick, 0, plataforma);
        return entradas.get(in);
    }

    public void confirmarAsistencia(String nick, String plataforma) {
        Influencer in = new Influencer(null, nick, 0, plataforma);
        entradaVIP entrada = entradas.get(in);

        if (entrada != null) {
            entrada.setEstadoEntrada(EstadoEntrada.CONFIRMADA);
        }
    }

    public void cancelarAsistencia(String nick, String plataforma) {
        Influencer in = new Influencer(null, nick, 0, plataforma);
        entradaVIP entrada = entradas.get(in);

        if (entrada != null) {
            entrada.setEstadoEntrada(EstadoEntrada.CANCELADA);
        }
    }

    public void listarInfluencerConfirmados() {
        Set<Influencer> lista = new HashSet<>();

        for (Map.Entry<Influencer, entradaVIP> e : entradas.entrySet()) {
            if (e.getValue().getEstadoEntrada() == EstadoEntrada.CONFIRMADA) {
                lista.add(e.getKey());
            }
        }

        System.out.println(lista);
    }

    public void listarInfluencerCancelado() {
        Set<Influencer> lista = new HashSet<>();

        for (Map.Entry<Influencer, entradaVIP> e : entradas.entrySet()) {
            if (e.getValue().getEstadoEntrada() == EstadoEntrada.CANCELADA) {
                lista.add(e.getKey());
            }
        }

        System.out.println(lista);
    }

    public void listarPendientes() {
        for (Map.Entry<Influencer, entradaVIP> e : entradas.entrySet()) {
            if (e.getValue().getEstadoEntrada() == EstadoEntrada.ENVIADA) {
                System.out.println(e.getKey() + " -> " + e.getValue());
            }
        }
    }

    public void top3Influencers() {
        List<Influencer> lista = new ArrayList<>(entradas.keySet());

        lista.sort((a, b) -> b.getNumSeguidores() - a.getNumSeguidores());

        for (int i = 0; i < 3 && i < lista.size(); i++) {
            Influencer inf = lista.get(i);
            System.out.println(inf + " -> " + entradas.get(inf).getTipoEntrada());
        }
    }
}