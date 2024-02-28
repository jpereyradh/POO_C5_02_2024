package presencial;

public class Socio {
    private String nombre;
    private Integer numeroSocio;
    private Double cuotaMensual;
    private String actividad;

    //constuctor: un metodo que nos permite instanciar un objeto(crear)
    //click derecho---> generate--> Constructor--> seleccion de atributos
    public Socio(String nombre, Integer numeroSocio, Double cuotaMensual, String actividad) {
        this.nombre = nombre;
        this.numeroSocio = numeroSocio;
        this.cuotaMensual = cuotaMensual;
        this.actividad = actividad;
    }
    public Double calcularCostoMensual(){
        double mantYLimp= 0.05*cuotaMensual;
        System.out.println("precio de mantenimiento y limpieza: "+mantYLimp);
        System.out.println("costo sin mantenimiento: "+cuotaMensual);
        return cuotaMensual+mantYLimp;
    }
    public Double calcularCostoMensual(Double interesPorMora){

        return cuotaMensual+(interesPorMora*cuotaMensual);
    }

    public Double getCuotaMensual() {
        return cuotaMensual;
    }
}
