package Unidad5.EjercicioPasajeJAVA;

public class Libro {
    private String titulo;
    private String editorial;
    private int anio;
    private long isnb;


    public Libro ( ){
        this.titulo = "";
        this.editorial = "";
        this.anio = 0;
        this.isnb = 0;
    }


    public Libro (String titulo,String editorial, int anio, long isnb){
        this.titulo = titulo;
        this.editorial = editorial;
        this.anio = anio; 
        this.isnb = isnb;

    }


    public String getTitulo() {
        return titulo;
    }


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public String getEditorial() {
        return editorial;
    }


    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }


    public int getAnio() {
        return anio;
    }


    public void setAnio(int anio) {
        this.anio = anio;
    }


    public long getIsnb() {
        return isnb;
    }


    public void setIsnb(long isnb) {
        this.isnb = isnb;
    }

    

}


