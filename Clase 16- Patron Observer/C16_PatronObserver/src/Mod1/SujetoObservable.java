package Mod1;

public interface SujetoObservable {

    void agregarSeguidor(SujetoObservador sujetoObservador);
    void eliminarSeguidor(SujetoObservador sujetoObservador);
   void subirFoto();
   void actualizar(String notificacion);

}
