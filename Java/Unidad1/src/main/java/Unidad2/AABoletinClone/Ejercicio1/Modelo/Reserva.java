package main.java.Unidad2.AABoletinClone.Ejercicio1.Modelo;

import java.util.Objects;

public class Reserva implements Cloneable {

    private String nombrePasajero;
    private String destinoVuelo;
    private String asiento;
    private int precioBillete;
    private static int contador = 0;
    private int id;

    public Reserva(String nombrePasajero, String destinoVuelo, String asiento, int precioBillete) {
        this.nombrePasajero = nombrePasajero;
        this.destinoVuelo = destinoVuelo;
        this.asiento = asiento;
        this.precioBillete = precioBillete;
        contador++;
        this.id = contador;
    }

    public String getNombrePasajero() { return nombrePasajero; }
    public void setNombrePasajero(String nombrePasajero) { this.nombrePasajero = nombrePasajero; }
    public String getDestinoVuelo() { return destinoVuelo; }
    public void setDestinoVuelo(String destinoVuelo) { this.destinoVuelo = destinoVuelo; }
    public String getAsiento() { return asiento; }
    public void setAsiento(String asiento) { this.asiento = asiento; }
    public int getPrecioBillete() { return precioBillete; }
    public void setPrecioBillete(int precioBillete) { this.precioBillete = precioBillete; }
    public int getId() { return id; }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Reserva reserva = (Reserva) o;
        return id == reserva.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "nombrePasajero='" + nombrePasajero + '\'' +
                ", destinoVuelo='" + destinoVuelo + '\'' +
                ", asiento='" + asiento + '\'' +
                ", precioBillete=" + precioBillete +
                ", id=" + id +
                '}';
    }

    @Override
    public Reserva clone() {
        try {
            return (Reserva) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
}