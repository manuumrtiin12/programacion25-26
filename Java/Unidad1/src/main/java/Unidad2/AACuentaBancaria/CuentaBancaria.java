package main.java.Unidad2.AACuentaBancaria;

public class CuentaBancaria {

    private double saldo;
    private String numeroCuenta;
    private Persona titularCuenta;
    private Persona autorizado;

    public double ingresarDinero(double dinero) {
        this.saldo += dinero;

        return  this.saldo;
    }

    public double retirarDinero(double dinero) {

        if (this.saldo >= dinero) {
            this.saldo -= dinero;

        } else {
            System.out.println("Saldo insuficiente para retirar " + dinero);
        }
        return this.saldo;
    }

    public boolean importeEsPositivo (double dinero) {

        boolean verificado = false;

        if (dinero >= 0) {
            verificado = true;
        }

        return verificado;
    }

    public void eliminarAutorizado() {

        if (this.autorizado != null) {
            this.autorizado = null;
        }
    }

    public boolean validarTieneAutorizado() {

        if (this.autorizado == null) {
            return false;
        }

        else {
            return true;
        }

    }

    public CuentaBancaria(double saldo, String numeroCuenta, Persona titularCuenta) {
        this.saldo = saldo;
        this.numeroCuenta = numeroCuenta;
        this.titularCuenta = titularCuenta;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" +
                "saldo=" + saldo +
                ", numeroCuenta='" + numeroCuenta + '\'' +
                ", titularCuenta=" + titularCuenta +
                ", autorizado=" + autorizado +
                '}';
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public Persona getTitularCuenta() {
        return titularCuenta;
    }

    public void setTitularCuenta(Persona titularCuenta) {
        this.titularCuenta = titularCuenta;
    }

    public Persona getAutorizado() {
        return autorizado;
    }

    public void setAutorizado(Persona autorizado) {
        this.autorizado = autorizado;
    }
}
