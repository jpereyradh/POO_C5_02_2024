package presencial;

public class Triste  extends Estado{
    @Override
    public void darDeComer() {
        System.out.println("hace 2 beep y vomita");
    }

    @Override
    public void darBeber() {
        System.out.println("hace 3 beep y titila el display");
    }

    @Override
    public void darMimos() {
        System.out.println("se pone feliz");
    }

    @Override
    public String toString() {
        return "Triste";
    }
}
