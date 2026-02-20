package Unidad2.AAEjercicioDomotica;

public class CentralitaDomotica {

    private Inteligente[] dispositivos;
    private int contador;

    public CentralitaDomotica() {
        dispositivos = new Inteligente[10];
        contador = 0;
    }

    public void añadirDispositivo(Inteligente d) {
        if (contador < dispositivos.length) {
            dispositivos[contador] = d;
            contador++;
            System.out.println("Dispositivo añadido correctamente.");
        } else {
            System.out.println("Error: La centralita está llena.");
        }
    }

    public Inteligente buscarDispositivo(String codigoSerie) {
        for (int i = 0; i < contador; i++) {
            if (dispositivos[i] instanceof Electrodomestico) {
                if (((Electrodomestico) dispositivos[i]).getCodigoSerie().equals(codigoSerie)) {
                    System.out.println("Dispositivo encontrado: " + codigoSerie);
                    return dispositivos[i];
                }
            } else if (dispositivos[i] instanceof SistemaIluminacion) {
                if (((SistemaIluminacion) dispositivos[i]).getCodigoSerie().equals(codigoSerie)) {
                    System.out.println("Dispositivo encontrado: " + codigoSerie);
                    return dispositivos[i];
                }
            }
        }
        System.out.println("Dispositivo " + codigoSerie + " no encontrado.");
        return null;
    }

    public void ejecutarRutinaDiaria() {
        for (int i = 0; i < contador; i++) {
            dispositivos[i].conectar();
            dispositivos[i].encender();
        }
    }
}
