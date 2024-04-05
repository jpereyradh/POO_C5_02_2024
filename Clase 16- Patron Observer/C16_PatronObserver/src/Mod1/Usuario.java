package Mod1;

import java.util.ArrayList;
import java.util.List;

public class Usuario implements SujetoObservable {
    private String nombre;

    private List<SujetoObservador> seguidores=new ArrayList<>();

    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void agregarSeguidor(SujetoObservador sujetoObservador) {
        seguidores.add(sujetoObservador);
    }

    @Override
    public void eliminarSeguidor(SujetoObservador sujetoObservador) {
        seguidores.remove(sujetoObservador);
    }

    @Override
    public void subirFoto() {
        String notificacion=nombre +" subio una foto";
        actualizar(notificacion);

    }

    @Override
    public void actualizar(String notificacion) {
        for (SujetoObservador seguidor : seguidores) {
            seguidor.notificar(notificacion);
        }

    }
}
