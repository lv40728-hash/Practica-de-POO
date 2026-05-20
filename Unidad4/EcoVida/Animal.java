package Unidad4.EcoVida;

public abstract class Animal {
    private String nombre;

    public Animal () {
        this.nombre = "";
    }
   
    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

     
    abstract String hacerSonido();
    
    
}
