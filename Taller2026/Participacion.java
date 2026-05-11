public class Participacion {
    private boolean esLocal;
    //Dale al + hija por dios
    public Participacion () {
        this.esLocal = false;
    }

    public Participacion (boolean esLocal) {
        this.esLocal = esLocal;
    }

    public boolean setEsLocal (){
        return esLocal;
    }
    public void getEsLocal (boolean esLocal) {
        this.esLocal = esLocal;
    }

    public TipoEvento cantidadGoles () {
        return TipoEvento.GOL;
    }
    public TipoEvento cantidadTarjAmarillas () {
        return TipoEvento.TARJETAAMARILLA;
    }
    public TipoEvento cantidadTarjRojas () {
        return TipoEvento.TARJETAROJA ;
    }

    
}    
