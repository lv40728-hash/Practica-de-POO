package Unidad4.ArteMusical;

public class Piano extends Instrumento implements Afinable {
    public Piano (String nombre){
        super (nombre);
    }

    @Override 
    public String tocar () {
        return "El piano emite notas profundas";
    }

    @Override 
    public String afinar (){
        return "por tecnico especializado";
    }
}
