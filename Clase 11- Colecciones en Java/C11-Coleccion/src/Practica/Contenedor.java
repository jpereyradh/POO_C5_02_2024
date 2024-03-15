package Practica;

public class Contenedor {
    private int numero;
    private Pais procedencia;
    private Boolean esPeligroso;

    public Contenedor(int numero, Pais procedencia, Boolean esPeligroso) {
        this.numero = numero;
        this.procedencia = procedencia;
        this.esPeligroso = esPeligroso;
    }

    public int getNumero() {
        return numero;
    }

    public Pais getProcedencia() {
        return procedencia;
    }

    public Boolean getEsPeligroso() {
        return esPeligroso;
    }

    @Override
    public String toString() {
        return "Contenedor{" +
                "numero=" + numero +
                ", procedencia=" + procedencia +
                ", esPeligroso=" + esPeligroso +
                '}';
    }
}
