package Embarcacion;

public class Velero extends Embarcacion{
    private int cantidadMastiles;

    public Velero(Capitan capitan, int precioBase, int valorAdicional, int anioFabricacion, double eslora, int cantidadMastiles) {
        super(capitan, precioBase, valorAdicional, anioFabricacion, eslora);
        this.cantidadMastiles = cantidadMastiles;
    }
    public boolean esGrande(){
        return cantidadMastiles>4;
    }
}
