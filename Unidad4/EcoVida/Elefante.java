package Unidad4.EcoVida;

public class Elefante extends Animal implements Comestible {
    public Elefante (String nombre) {
        super ();
    }
    
    @Override
    public String  hacerSonido (){
        return "El elfante barrita";
    }

    @Override 
    public String comer () {
        return "hierba";
    }
}
