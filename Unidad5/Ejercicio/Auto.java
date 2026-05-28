package Unidad5.Ejercicio;

public class Auto {
    private String marca;
    private String modelo;
    private int anio;
    private double precioVenta;

    public Auto () {
        this.marca = "";
        this.modelo = "";
        this.anio = 0;
        this.precioVenta = 0; 
    }

    public Auto (String marca, String modelo ,int anio, double precioVenta){
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.precioVenta = precioVenta;
    }

    public String setMarca () {
        return marca;
    }
    public void getMarca (String marca) {
        this.marca = marca;
    }

    public String setModelo () {
        return modelo;
    }
    public void getModelo (String modelo) {
        this.modelo = modelo;
    }

    public int setAnio () {
        return anio;
    } 
    public void getAnio (int anio) {
        this.anio = anio;
    }

    public double setprecioVenta () {
        return precioVenta;
    }
    public void getPrecioVenta (double precioVenta) {
        this.precioVenta = precioVenta;
    }

    @Override
    public String toString() {
        return "Auto [marca=" + marca + ", modelo=" + modelo + ", anio=" + anio + ", precioVenta=" + precioVenta + "]";
    }

    


}
