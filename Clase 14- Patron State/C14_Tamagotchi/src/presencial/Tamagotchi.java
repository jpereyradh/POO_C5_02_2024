package presencial;

public class Tamagotchi {
    //necesitamos una relacion de asociacion
    private Estado estadoActual;

    public Tamagotchi(Estado estadoActual /*hay que sacar el parametro para que inicialice por default*/) {
        this.estadoActual= estadoActual; //no inicializa por default
        //estadoActual= new Hambriento(); //inicializa por default
    }
    public void darDeComer(){
        estadoActual.darDeComer();
        if(estadoActual instanceof Hambriento){
            estadoActual= new Feliz();
        } else if (estadoActual instanceof Feliz) {
            estadoActual= new Sediento();

        } else if (estadoActual instanceof Sediento) {
            estadoActual= new Triste();
        }else{
            estadoActual= new Triste();
        }


    }    public void darDeBeber(){
        estadoActual.darBeber();
        if(estadoActual instanceof Hambriento){
            estadoActual= new Triste();
        } else if (estadoActual instanceof Triste) {

        } else if (estadoActual instanceof Sediento) {
            estadoActual= new Feliz();
        }else{
            estadoActual= new Feliz();
        }
    }
    public void DarMimos(){
        estadoActual.darMimos();
    }

    public Estado getEstadoActual() {
        return estadoActual;
    }

    public void setEstadoActual(Estado estadoActual) {
        this.estadoActual = estadoActual;
    }
}
