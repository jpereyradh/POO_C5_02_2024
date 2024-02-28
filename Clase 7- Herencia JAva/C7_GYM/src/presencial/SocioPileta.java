package presencial;

public class SocioPileta extends Socio {
    private Double costoPileta;
    private boolean estaHabilitado;


    public SocioPileta(String nombre, Integer numeroSocio, Double cuotaMensual, String actividad, Double costoPileta) {
        super(nombre, numeroSocio, cuotaMensual, actividad);
        this.costoPileta = costoPileta;
        this.estaHabilitado= false; //--> el objeto inicialice sin habilitacion
    }



    //firma del metodo, sobre carga del metodo y sobre escritura del metodo.
    //firmar el metodo, me garantiza de que sea ese metodo y no otro.
    //click derecho, generate, override methods.

    @Override //aca esta la firma del metodo.
    public Double calcularCostoMensual() {
        if(estaHabilitado==true){
        return super.calcularCostoMensual()+costoPileta;
    }else{
            System.out.println("No se le pudo cobrar el costo de pileta por no estar habilitado");
            return super.calcularCostoMensual();
        }}
   //la sobre carga indica que es el mismo metodo con diferencias en los parametros.
    @Override
    public Double calcularCostoMensual(Double interesPorMora) {
        if(estaHabilitado==true){
            return super.calcularCostoMensual(interesPorMora)+costoPileta;
        }else{
            return super.calcularCostoMensual(interesPorMora);
        }
}

    public Double getCostoPileta() {
        return costoPileta;
    }

    public void setCostoPileta(Double costoPileta) {
        this.costoPileta = costoPileta;
    }

    public boolean isEstaHabilitado() {
        return estaHabilitado;
    }

    public void setEstaHabilitado(boolean estaHabilitado) {
        this.estaHabilitado = estaHabilitado;
    }

    public void habilitarSocio(){
        this.estaHabilitado= true;
}

    @Override
    public Double getCuotaMensual() {
        return super.getCuotaMensual();
    }
}
