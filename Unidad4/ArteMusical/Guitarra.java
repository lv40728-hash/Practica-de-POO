package Unidad4.ArteMusical;

public class Guitarra extends Instrumento implements Afinable  {
    public Guitarra (String nombre) {
        super (nombre);
    }

    @Override 
    public  String tocar () {
        return "Suena a Cuerdas";
    }

    @Override
    public String afinar () {
        return "Afinador Digital";
    } 
}
