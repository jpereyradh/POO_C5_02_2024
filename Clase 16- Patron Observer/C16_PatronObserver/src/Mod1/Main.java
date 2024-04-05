package Mod1;

public class Main {
    public static void main(String[] args) {
        Usuario usuario= new Usuario("Jorgito");
        SujetoObservador seguidor= new Seguidor("Juancito");
        SujetoObservador seguidor2= new Seguidor("Antonio");


        usuario.agregarSeguidor(seguidor);
        usuario.agregarSeguidor(seguidor2);
        usuario.subirFoto();
        usuario.subirFoto();
        System.out.println("Cantidad de notifaciones para el usuario: "+seguidor.getNombre()+" "+seguidor.getCantidadDeNotificacion());
        System.out.println("Cantidad de notifaciones para el usuario: "+seguidor2.getNombre()+" "+seguidor2.getCantidadDeNotificacion());

    }
}
