package presencial;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Equipo {
    private String nombre;
    //aca tengo que hacer la relacion de asociar un equipo TIENE muchos jugadores
    private List<Jugador> listaJugadores; //null

    public Equipo(String nombre) {
        this.nombre = nombre;
        listaJugadores= new ArrayList<>();
    }
    public void agregarJugador(Jugador jugador){
        listaJugadores.add(jugador);
    }
    public void mostrarJugadoresTitulares(){
        System.out.println("Metodo 1");
        List<Jugador> jugadoresOrdenados= new ArrayList<>();
        for (Jugador jugador : listaJugadores) {
            if(jugador.getEsTitular()){
                jugadoresOrdenados.add(jugador);
            }
        }
        Collections.sort(jugadoresOrdenados);
        for (Jugador jugadoresOrdenado : jugadoresOrdenados) {
            System.out.println(jugadoresOrdenado);
        }
    }
    public void mostrarJugadoresTitulares2(){
        System.out.println("Metodo 2");
        System.out.println("****Jugadores Titulares***");
        listaJugadores.stream().filter(Jugador::getEsTitular)
                .sorted()
                .forEach(jugador -> System.out.println(jugador.getNombre()+"- "+jugador.getNumeroCamiseta()));
    }
   public int getCantidadDeLesionadosTitulares(){
        return (int)listaJugadores.stream().filter(jugador -> jugador.getEsTitular()&& jugador.getEstaLesionado()).count();
   }


}
