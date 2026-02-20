package Unidad2.AABoletinEstaticos.Ejercicio1.Modelo;

import java.time.LocalDate;
import java.util.Objects;

public class CuentaBancaria {

    private int saldo;
    private LocalDate fechApertura;
    private int id;
    private static int contador;
    private String iban;
    private Cliente clienteTitular;
    private Cliente clienteAutorizado;


    public CuentaBancaria(int saldo, LocalDate fechApertura, String iban, Cliente clienteTitular) {
        this.saldo = saldo;
        this.fechApertura = fechApertura;
        contador++;
        this.id = contador;
        this.iban = iban;
        this.clienteTitular = clienteTitular;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public LocalDate getFechApertura() {
        return fechApertura;
    }

    public void setFechApertura(LocalDate fechApertura) {
        this.fechApertura = fechApertura;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        CuentaBancaria.contador = contador;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public Cliente getClienteTitular() {
        return clienteTitular;
    }

    public void setClienteTitular(Cliente clienteTitular) {
        this.clienteTitular = clienteTitular;
    }

    public Cliente getClienteAutorizado() {
        return clienteAutorizado;
    }

    public void setClienteAutorizado(Cliente clienteAutorizado) {
        this.clienteAutorizado = clienteAutorizado;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        CuentaBancaria that = (CuentaBancaria) o;
        return saldo == that.saldo && id == that.id && Objects.equals(fechApertura, that.fechApertura) && Objects.equals(iban, that.iban) && Objects.equals(clienteTitular, that.clienteTitular) && Objects.equals(clienteAutorizado, that.clienteAutorizado);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, iban);
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" +
                "saldo=" + getSaldo() +
                ", fechApertura=" + getFechApertura() +
                ", id=" + getId() +
                ", iban='" + getIban() + '\'' +
                ", clienteTitular=" + getClienteTitular() +
                ", clienteAutorizado=" + getClienteAutorizado() +
                '}';
    }
}
