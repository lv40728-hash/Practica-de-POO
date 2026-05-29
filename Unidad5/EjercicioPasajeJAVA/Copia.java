package Unidad5.EjercicioPasajeJAVA;

public class Copia {
    private String id;
    private Estado estado;
   
    public Copia () {
        this.id = "";
        this.estado = null;
    }

    public Copia (String id, Estado estado) {
        this.id = id;
        this.estado = estado;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public Estado getEstado() {
        return estado;
    }
    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    
    
       
}
