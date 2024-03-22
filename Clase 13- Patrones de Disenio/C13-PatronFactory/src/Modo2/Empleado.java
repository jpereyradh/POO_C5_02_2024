package Modo2;

public abstract class Empleado {
    private String apellido,nombre;
    private int legajo;


    public abstract double calcularSueldo(int dias);
}
