package Unidad4.EcoVida;

public class Leon extends Animal implements Comestible {

    public Leon (String nombre){
        super(nombre);
    }
    
    @Override
    public String  hacerSonido (){
        return "El leon ruje";
    }

    @Override 
    public String comer () {
        return "carne";
    }
}
