package presencial;

public class Main {
    public static void main(String[] args) {
        Equipo equipo = new Equipo("Digital FC");
        equipo.agregarJugador(new Jugador(10,"Ronaldinho",false,true));
        equipo.agregarJugador(new Jugador(5,"Ronalo",false,true));
        equipo.agregarJugador(new Jugador(7,"Roberto Carlos",true,true));
        equipo.agregarJugador(new Jugador(29,"Thiaginho",true,true));
        equipo.agregarJugador(new Jugador(30,"Lionel Messi",true,false));


        equipo.mostrarJugadoresTitulares();
        System.out.println("**********************************");
        equipo.mostrarJugadoresTitulares2();
        System.out.println("*********************************");
        System.out.println("Cantidad de lesionados y Titulares: "+equipo.getCantidadDeLesionadosTitulares());

    }
}
