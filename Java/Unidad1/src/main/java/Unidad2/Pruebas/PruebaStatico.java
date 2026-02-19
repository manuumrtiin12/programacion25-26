package Unidad2.Pruebas;

public class PruebaStatico {

    public static void estat(){
        System.out.println("Estatico ");
    }

    public void noEstat(){
        System.out.println("No estatico");
    }

    static void main(String[] args) {
        PruebaStatico a = new PruebaStatico();
        PruebaStatico.estat();
        //Metodo.noEstat();
        a.noEstat();
        a.estat();

    }
}
