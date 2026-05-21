package Unidad4.ArteMusical;

public abstract class Instrumento {
    private String nombre;

    public Instrumento(String nombre) {
        this.nombre = nombre;
    }

    public String setNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public abstract String tocar();
}
