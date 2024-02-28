package MesaTrabajo;

public class Nave extends ObjetoGrafico {
    private Double velocidad;
    private int vida;

    public Nave(int posx, int posy, char direccion, Double velocidad) {
        super(posx, posy, direccion);
        this.velocidad = velocidad;
        this.vida=100; //inicializo por default
    }
    public void girar(char nuevaDireccion){
        this.direccion= nuevaDireccion;
    }
    public void restarVida(int valor){
        vida -=valor; //esto quiere decir vida= vida-valor;
    }

    @Override
    public String toString() {
        System.out.println("Recorrido de la nave");
        return super.toString();
    }
}
