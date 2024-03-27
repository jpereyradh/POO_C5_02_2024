package presencial;

public class Feliz extends Estado{
    @Override
    public void darDeComer() {
        System.out.println("se pone sediento");
    }

    @Override
    public void darBeber() {
        System.out.println("se pone hambriento");

    }

    @Override
    public void darMimos() {
        System.out.println("sin cambios");

    }

    @Override
    public String toString() {
        return "Feliz";
    }
}
