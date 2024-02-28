package MesaTrabajo;

public class Cliente {
    public static void main(String[] args) {
        Nave nave= new Nave(10,20,'N',2.0);
        System.out.println(nave.toString());
        nave.irA(15,40,'S');
        System.out.println(nave.toString());

    }
}
