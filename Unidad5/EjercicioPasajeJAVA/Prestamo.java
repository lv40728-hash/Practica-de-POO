package Unidad5.EjercicioPasajeJAVA;

public class Prestamo {
   private String fechaEntrega;
   private String  fechaDevolucion;
   private boolean multa;
   
   
   
   public Prestamo(String fechaEntrega, String fechaDevolucion, boolean multa) {
    this.fechaEntrega = fechaEntrega;
    this.fechaDevolucion = fechaDevolucion;
    this.multa = multa;
    }
   
    public String getFechaEntrega() {
    return fechaEntrega;
   }
   public void setFechaEntrega(String fechaEntrega) {
    this.fechaEntrega = fechaEntrega;
   }
   
   public String getFechaDevolucion() {
    return fechaDevolucion;
   }
   public void setFechaDevolucion(String fechaDevolucion) {
    this.fechaDevolucion = fechaDevolucion;
   }
   
   public boolean isMulta() {
    return multa;
   }
   public void setMulta(boolean multa) {
    this.multa = multa;
   }

   
}
