package main.java.Unidad2.AABoletinEnumerados.Ejercicio3;

public class Robot {

    int identificador;
    int nivelSuciedadDeposito;
    ModoFuncionamiento Funcionamiento;
    int bateria;
    Habitacion habitacionAsignada;

    public void asignarHabitacion(Habitacion asignada) {

        if(this.Funcionamiento == ModoFuncionamiento.AUTO) {
            this.habitacionAsignada = asignada;
            asignada.estado = EstadoHabitacion.LIMPIANDO;
        }

        else {
            System.out.println("El robot" + identificador + " no esta disponible");
        }
    }

    public void vaciarDeposito() {
        this.nivelSuciedadDeposito = 0;
    }

    public void recargar() {
        this.bateria = 100;
    }

    public Robot(int identificador, int nivelSuciedadDeposito, ModoFuncionamiento funcionamiento, int bateria, Habitacion habitacionAsignada) {
        this.identificador = identificador;
        this.nivelSuciedadDeposito = nivelSuciedadDeposito;
        Funcionamiento = funcionamiento;
        this.bateria = bateria;
        this.habitacionAsignada = habitacionAsignada;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "identificador=" + identificador +
                ", nivelSuciedadDeposito=" + nivelSuciedadDeposito +
                ", Funcionamiento=" + Funcionamiento +
                ", bateria=" + bateria +
                ", habitacionAsignada=" + habitacionAsignada +
                '}';
    }
}
