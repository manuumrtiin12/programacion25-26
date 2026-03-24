package main.java.Unidad2.AABoletinClone.Ejercicio1.Modelo;

import java.util.LinkedHashSet;
import java.util.Objects;

public class RepositorioReserva {

    private LinkedHashSet<Reserva> reservas;

    public RepositorioReserva() {
        this.reservas = new LinkedHashSet<>();
    }

    public void agregaReserva(Reserva r) {
        reservas.add(r);
    }

    public Reserva obtenerReserva(int id) {
        for (Reserva r : reservas) {
            if (r.getId() == id) return r;
        }
        return null;
    }

    public void mostrarReservas() {
        for (Reserva r : reservas) {
            System.out.println(r);
        }
    }

    public Reserva cambiarAsiento(int id, String nuevoAsiento, boolean confirmar) {
        Reserva original = obtenerReserva(id);
        if (original == null) return null;

        if (!confirmar) {
            // Simulación: devuelve copia con el cambio
            Reserva copia = original.clone();
            copia.setAsiento(nuevoAsiento);
            return copia;
        } else {
            // Confirmar: modifica la original
            original.setAsiento(nuevoAsiento);
            return original;
        }
    }

    public LinkedHashSet<Reserva> getReservas() { return reservas; }
    public void setReservas(LinkedHashSet<Reserva> reservas) { this.reservas = reservas; }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        RepositorioReserva that = (RepositorioReserva) o;
        return Objects.equals(reservas, that.reservas);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(reservas);
    }

    @Override
    public String toString() {
        return "RepositorioReserva{" +
                "reservas=" + reservas +
                '}';
    }
}