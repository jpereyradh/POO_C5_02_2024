package Mod1;

public interface SujetoObservador {
    void notificar(String mensaje);

    int getCantidadDeNotificacion();
    String getNombre();
}
