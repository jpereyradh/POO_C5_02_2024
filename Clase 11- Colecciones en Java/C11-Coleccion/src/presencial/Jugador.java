package presencial;

public class Jugador implements Comparable<Jugador> {
    private int numeroCamiseta;
    private String nombre;
    private Boolean esTitular;
    private Boolean estaLesionado;

    public Jugador(int numeroCamiseta, String nombre, Boolean esTitular, Boolean estaLesionado) {
        this.numeroCamiseta = numeroCamiseta;
        this.nombre = nombre;
        this.esTitular = esTitular;
        this.estaLesionado = estaLesionado;
    }

    public int getNumeroCamiseta() {
        return numeroCamiseta;
    }

    public String getNombre() {
        return nombre;
    }

    public Boolean getEsTitular() {
        return esTitular;
    }

    public Boolean getEstaLesionado() {
        return estaLesionado;
    }

    @Override
    public int compareTo(Jugador otroJugador) {
        return Integer.compare(numeroCamiseta,otroJugador.numeroCamiseta);
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "numeroCamiseta=" + numeroCamiseta +
                ", nombre='" + nombre + '\'' +
                ", esTitular=" + esTitular +
                ", estaLesionado=" + estaLesionado +
                '}';
    }
}
