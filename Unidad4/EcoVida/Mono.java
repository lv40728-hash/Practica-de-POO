package Unidad4.EcoVida;

public class Mono extends Animal implements Comestible {
    public Mono (String nombre) {
        super();
    }
    
     @Override
    public String  hacerSonido (){
        return "El leon ruje";
    }

     @Override
    public String  comer (){
        return "Frutas";
    }


}
