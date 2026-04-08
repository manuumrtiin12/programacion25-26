package main.java.Unidad2.AASimulacionColecciones.Modelo;

import main.java.Unidad2.AASimulacionColecciones.Exception.ReservaException;

import java.time.LocalDate;
import java.util.ArrayList;

public class RepositorioEventos {

    ArrayList<Evento> repoEventos = new ArrayList<Evento>();

    public void addRepositorioEvento(Evento e) {

        if (e.getFechaEvento().isBefore(LocalDate.now())) {
            throw new ReservaException("No se puede registrar un evento con fecha pasada");
        }

        for (Evento even : repoEventos) {
            if (e.getNombreEvento().equals(even.getNombreEvento()) &&
                    e.getFechaEvento().equals(even.getFechaEvento())) {
                throw new ReservaException("Ya existe un evento con el mismo nombre y fecha");
            }
        }

        repoEventos.add(e);
    }

    public Reserva mostrarReservaEvento(int idReserva, String nombreEvento, LocalDate fechaEvento) {

        Reserva reservaDevolver = null;

        for (Evento even : repoEventos) {
            for (Reserva reser : even.getListaReservas()) {

                if (reser.getIdReserva() == idReserva && even.getNombreEvento().equals(nombreEvento) && even.getFechaEvento().equals(fechaEvento)) {

                    reservaDevolver =  reser;
                }
            }

        }

        return reservaDevolver;

    }

    public void addReservaDeUsuarioAEvento(String emailUsuario, String nombreEvento) {

        for (Evento even : repoEventos){

            if (even.getNombreEvento().equals(nombreEvento)) {

                Usuario u = new Usuario("Pepe Viruela", emailUsuario);
                Reserva r = new Reserva(1, LocalDate.now(), EstadoReserva.FINALIZADA, u);

                even.getListaReservas().add(r);
            }
        }
     }
}
