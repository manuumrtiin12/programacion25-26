package Unidad2.AAEjercicioDomotica;

public class GestionaDomotica {

    public static void main(String[] args) {

        CentralitaDomotica central = new CentralitaDomotica();

        LavadoraInteligente lavadora = new LavadoraInteligente("L001", "LG", 120);
        CafeteraInteligente cafetera = new CafeteraInteligente("C001", "DeLonghi", 50, 20);
        BombillaRegulable bombilla = new BombillaRegulable("B001", "#FFFFFF");
        AlarmaVisual alarma = new AlarmaVisual("A001");

        central.añadirDispositivo(lavadora);
        central.añadirDispositivo(cafetera);
        central.añadirDispositivo(bombilla);
        central.añadirDispositivo(alarma);

        central.buscarDispositivo("L001");
        central.buscarDispositivo("X999");

        central.ejecutarRutinaDiaria();

        lavadora.iniciarCicloLavado();
        cafetera.prepararCafe();
        bombilla.cambiarAmbiente("#FFAA00");
        bombilla.apagar();
        alarma.activarModoPanico();
    }
}
