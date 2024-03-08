package Examen;

public class Examen {
    private Alumno alumno;
    private String titulo;
    private String enunciado;
    protected int notaEscrita;

    public Examen(Alumno alumno, String titulo, String enunciado, int notaEscrita) {
        this.alumno = alumno;
        this.titulo = titulo;
        this.enunciado = enunciado;
        this.notaEscrita = notaEscrita;
    }
    public boolean estaAprobado(){
        return notaEscrita>=4;
    }
}
