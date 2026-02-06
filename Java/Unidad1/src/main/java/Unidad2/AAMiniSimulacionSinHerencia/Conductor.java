package Unidad2.AAMiniSimulacionSinHerencia;

public class Conductor {
    private String nombre;
    private int añosExperiencia;

    public void conducir() {
        System.out.println(this.nombre + " con " + this.añosExperiencia + " años de experiencioa esta conduciendo ahora");
    }

    public Conductor(String nombre, int añosExperiencia) {
        this.nombre = nombre;
        this.añosExperiencia = añosExperiencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAñosExperiencia() {
        return añosExperiencia;
    }

    public void setAñosExperiencia(int añosExperiencia) {
        this.añosExperiencia = añosExperiencia;
    }

    @Override
    public String toString() {
        return "Conductor{" + "nombre='" + nombre + '\'' + ", añosExperiencia=" + añosExperiencia + '}';
    }
}
