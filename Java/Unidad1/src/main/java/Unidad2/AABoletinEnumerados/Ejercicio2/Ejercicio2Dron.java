package main.java.Unidad2.AABoletinEnumerados.Ejercicio2;

public class Ejercicio2Dron {

    int id;
    int bateria;
    Ejercicio2Estado estado;
    int porcentajeBateria;
    int cargaMaxima;
    String rutAsignada;

    public void asignarRuta(Ejercicio2Ruta ruta) {
        if (this.estado == Ejercicio2Estado.EN_REPOSO) {

            this.rutAsignada = ruta.toString();
            this.estado = Ejercicio2Estado.EN_RUTA;
            ruta.estadoPaquete = Ejercicio2EstadoPaquete.EN_REPARTO;
        } else {
            System.out.println("No es posible asignar la ruta: el dron no está EN_REPOSO.");
        }
    }

    public void cargarBateria() {

        if (this.porcentajeBateria == 0) {

            this.porcentajeBateria = 100;
            System.out.println("El dron " + id + " ha sido cargado al 100%.");
        }

        else {
            System.out.println("El dron " + id + " tiene bateria suficiante");
        }
    }

    public Ejercicio2Dron(int id, int bateria, Ejercicio2Estado estado, int porcentajeBateria, int cargaMaxima, String rutAsignada) {
        this.id = id;
        this.bateria = bateria;
        this.estado = estado;
        this.porcentajeBateria = porcentajeBateria;
        this.cargaMaxima = cargaMaxima;
        this.rutAsignada = rutAsignada;
    }

    @Override
    public String toString() {
        return "Ejercicio2Dron{" +
                "id=" + id +
                ", bateria=" + bateria +
                ", estado=" + estado +
                ", porcentajeBateria=" + porcentajeBateria +
                ", cargaMaxima=" + cargaMaxima +
                ", rutAsignada='" + rutAsignada + '\'' +
                '}';
    }
}
