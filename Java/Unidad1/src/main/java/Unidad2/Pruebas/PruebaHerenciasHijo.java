import Unidad2.Pruebas.PruebaHerenciasPadre;

public class PruebaHerenciasHijo extends PruebaHerenciasPadre {


    public void metodoHijo(){

        System.out.println("Hola soy el hijo");
    }
}

public void main(String[] args) {

    PruebaHerenciasHijo p = (PruebaHerenciasHijo) new PruebaHerenciasPadre();

    p.metodoHijo();
}
