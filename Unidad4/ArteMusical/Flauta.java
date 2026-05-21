package Unidad4.ArteMusical;

public class Flauta extends Instrumento implements Afinable {
    
    public Flauta (String nombre) {
        super (nombre);
    }

    @Override 
     public  String tocar () {
        return "La flauta silva con dulzura";
     }  

     @Override
     public String afinar (){
        return "Con ajuste Manual";
     }

}
