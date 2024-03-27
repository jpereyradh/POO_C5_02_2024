package presencial;

public class Sediento extends Estado{
    @Override
    public void darDeComer() {
        System.out.println("se pone triste");
    }

    @Override
    public void darBeber() {
        System.out.println("se pone feliz");
    }

    @Override
    public void darMimos() {
        System.out.println("sin cambios");
    }

    @Override
    public String toString() {
        return "Sediento";
    }
}
