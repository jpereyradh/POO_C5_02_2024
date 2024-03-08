package Examen;

import Embarcacion.Embarcacion;

public class ExamenFinal extends Examen implements Comparable<ExamenFinal> {
    private int notaOral;
    private String descripcion;

    public ExamenFinal(Alumno alumno, String titulo, String enunciado, int notaEscrita, int notaOral, String descripcion) {
        super(alumno, titulo, enunciado, notaEscrita);
        this.notaOral = notaOral;
        this.descripcion = descripcion;
    }

    @Override
    public int compareTo(ExamenFinal otroExamen) {
        // -1 si es menor
        // 0 si es igual
        // 1 si es mayor
        double promedioThis= (double) (notaEscrita+notaOral)/2; //6.8 8
        double promedioOtro=(double) (otroExamen.notaEscrita+ otroExamen.notaOral)/2; //9
        if(promedioThis==promedioOtro){
            return 0;
        } else if (promedioThis>promedioOtro) {
            return 1;
        }
        return -1;
    }
    public boolean esMayorQue(ExamenFinal otroExamen){
        double promedioThis= (double) (notaEscrita+notaOral)/2; //6.8 8
        double promedioOtro=(double) (otroExamen.notaEscrita+ otroExamen.notaOral)/2; //9
        return promedioThis>promedioOtro;
    }

    @Override
    public boolean estaAprobado() {
        double respuesta= (notaOral+notaEscrita)/2;
        if(respuesta>=4){
        return true;
    }else {
        return false;
        }
    }
}

