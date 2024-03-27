package presencial;

public class Main {
    public static void main(String[] args) {
        System.out.println("Estimos de la mascota virtual:");
        Estado estadoActual= new Hambriento(); //elegimos como comenzar
        Tamagotchi tamagotchi= new Tamagotchi(estadoActual);
        System.out.println("Estado inicial: "+tamagotchi.getEstadoActual());
        System.out.println("**********Prueba de Beber********************");
        tamagotchi.darDeBeber();
        System.out.println("Estado actual: "+tamagotchi.getEstadoActual());

        tamagotchi.darDeBeber();
        System.out.println("Estado actual: "+tamagotchi.getEstadoActual());
        tamagotchi.setEstadoActual(new Sediento());
        tamagotchi.darDeBeber();
        System.out.println("Estado actual: "+tamagotchi.getEstadoActual());
        System.out.println("***************Prueba de comida***********");
        tamagotchi.setEstadoActual(new Hambriento());
        System.out.println("inicialmente la mascota estaba:  "+tamagotchi.getEstadoActual());
        tamagotchi.darDeComer();
        System.out.println("estado una vez hambriento y comido: "+tamagotchi.getEstadoActual());


    }
}
