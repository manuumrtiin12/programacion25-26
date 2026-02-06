package Unidad2.AAMiniSimulacionSinHerencia;

public class Coche {

    private String marca;
    private String modelo;
    private String matricula;
    private Conductor dueño;
    private Estado estado;
    private Sensor sensor;

    public void arrancar(Conductor conductor) {

        if (this.dueño.equals(conductor.getNombre())) {

            System.out.println("Arranque autorizado, bienvenido " + this.dueño);
            this.estado = Estado.ARRANCADO;
        }

        else {
            System.out.println("Credenciales incorrectas, arranque bloqueado");
        }
    }

    public void verificarSiDebeParar(Sensor sensor) {

        if (this.estado == Estado.ARRANCADO) {
            if (sensor.alertaObstaculo() == true) {
                System.out.println("Obstaculo acercandose, pare el vehiculo");
            }
        }
    }

    public Coche(String marca, String modelo, String matricula, Conductor dueño, Sensor sensor) {
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.dueño = dueño;
        this.sensor = sensor;
        this.estado = Estado.APAGADO;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Conductor getDueño() {
        return dueño;
    }

    public void setDueño(Conductor dueño) {
        this.dueño = dueño;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Sensor getSensor() {
        return sensor;
    }

    public void setSensor(Sensor sensor) {
        this.sensor = sensor;
    }

    @Override
    public String toString() {
        return "Coche{" + "marca='" + marca + '\'' + ", modelo='" + modelo + '\'' +
                ", matricula='" + matricula + '\'' + ", dueño=" + dueño +
                ", estado=" + estado + ", sensor=" + sensor + '}';
    }
}