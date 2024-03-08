package Embarcacion;

public class Embarcacion {
    private Capitan capitan;
    private int precioBase;
    private int valorAdicional;
    private int anioFabricacion;
    private double eslora;

    public Embarcacion(Capitan capitan, int precioBase, int valorAdicional, int anioFabricacion, double eslora) {
        this.capitan = capitan;//--> incluyendo al capitan
        this.precioBase = precioBase;
        this.valorAdicional = valorAdicional;
        this.anioFabricacion = anioFabricacion;
        this.eslora = eslora;
    }
    public double calcularPrecioAlquiler(){
        double montoAlquiler= precioBase; //100+20
        if(anioFabricacion>2020){
            montoAlquiler+=valorAdicional;
        }
        return montoAlquiler;
    }
}
