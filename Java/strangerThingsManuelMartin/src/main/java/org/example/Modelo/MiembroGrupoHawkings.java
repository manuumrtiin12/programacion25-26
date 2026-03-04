package org.example.Modelo;

public class MiembroGrupoHawkings extends Humano{

    private boolean tienePoderPsiquico;

    public double calcularDannoPotencial(int factorAmenaza) {

        double dañoPotencial = 0;


        dañoPotencial = getSaludBase() * 0.1 * factorAmenaza;

        if (this.tienePoderPsiquico = true) {
            dañoPotencial *= 2;
        }

        return dañoPotencial;
    }

    public MiembroGrupoHawkings(String nombre, boolean tieneEquipo, boolean tienePoderPsiquico) {
        super(nombre, tieneEquipo);
        this.tienePoderPsiquico = tienePoderPsiquico;
    }

    public MiembroGrupoHawkings(String nombre, double saludBase, boolean tieneEquipo, boolean tienePoderPsiquico) {
        super(nombre, saludBase, tieneEquipo);
        this.tienePoderPsiquico = tienePoderPsiquico;
    }
}
