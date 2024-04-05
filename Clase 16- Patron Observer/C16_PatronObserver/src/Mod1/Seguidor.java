package Mod1;

public class Seguidor implements SujetoObservador {
    private String nombre;
    private int cantidadDeNotificaciones=0;

    public Seguidor(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void notificar(String mensaje) {
        System.out.println(nombre+" recibio una notificacion: "+mensaje);
        cantidadDeNotificaciones++;
    }

    @Override
    public int getCantidadDeNotificacion() {
        return cantidadDeNotificaciones;
    }

    @Override
    public String getNombre() {
        return nombre;
    }


}
