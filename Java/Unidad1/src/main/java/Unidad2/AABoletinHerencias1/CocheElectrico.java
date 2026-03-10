package main.java.Unidad2.AABoletinHerencias1;

import java.util.Objects;

public class CocheElectrico extends Vehiculo{

    private String tipoBateria;

    public void verificaTipoBateria() {

        if (this.tipoBateria != "LFP" || this.tipoBateria != "NCM") {
            this.tipoBateria = null;
            System.out.println("Tipo de bateria invalida, vaciando campo...");
        }
    }

    public CocheElectrico(String duenyo, int numPuertas, int numVehiculos, String tipoBateria) {
        super(duenyo, numPuertas, numVehiculos);
        this.tipoBateria = tipoBateria;
    }

    @Override
    public String toString() {
        return "CocheElectrico{" +
                "tipoBateria='" + tipoBateria + '\'' +
                '}';
    }

    public String getTipoBateria() {
        return tipoBateria;
    }

    public void setTipoBateria(String tipoBateria) {
        this.tipoBateria = tipoBateria;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        CocheElectrico that = (CocheElectrico) o;
        return Objects.equals(tipoBateria, that.tipoBateria);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), tipoBateria);
    }
}
