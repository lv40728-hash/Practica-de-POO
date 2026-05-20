package Unidad4.Practica1;

public class Vehiculo {
    private String patente;
    private String marca;

    public Vehiculo (String patente, String marca) {
        this.patente = patente;
        this.marca = marca;
    }

    public String setPatente () {
        return patente;
    }
    public void getPatente (String patente) {
        this.patente = patente;
    }

    public String setMarca () {
        return marca;
    }
    public void getMarca (String marca) {
        this.marca = marca;
    }
}
