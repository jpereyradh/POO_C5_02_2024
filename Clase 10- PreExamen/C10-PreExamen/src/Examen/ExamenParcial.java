package Examen;

public class ExamenParcial extends Examen {
    private int numeroUnidad;
    private int numeroReintento;

    public ExamenParcial(Alumno alumno, String titulo, String enunciado, int notaEscrita, int numeroUnidad, int numeroReintento) {
        super(alumno, titulo, enunciado, notaEscrita);
        this.numeroUnidad = numeroUnidad;
        this.numeroReintento = numeroReintento;

    }
    public boolean sePuedeRecuperar(){ //nU 3,
        if(numeroUnidad<=3){//3
            return numeroReintento<3; //true
        }else {
            return numeroReintento<2;
        }
    }
}
