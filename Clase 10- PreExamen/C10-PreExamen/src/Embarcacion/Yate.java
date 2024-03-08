package Embarcacion;

public class Yate extends Embarcacion{
    private int cantCamarotes;

    public Yate(Capitan capitan, int precioBase, int valorAdicional, int anioFabricacion, double eslora, int cantCamarotes) {
        super(capitan, precioBase, valorAdicional, anioFabricacion, eslora);
        this.cantCamarotes = cantCamarotes;
    }
    public boolean compararYate(Yate otroYate){
        return this.cantCamarotes> otroYate.cantCamarotes;
    }
}
