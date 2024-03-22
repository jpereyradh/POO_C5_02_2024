package Modo1;

public class EmpleadoRelacionDepencia extends Empleado {
    private double sueldoMensual;

    public EmpleadoRelacionDepencia(double sueldoMensual) {
        this.sueldoMensual = sueldoMensual;
    }

    @Override
    public double calcularSueldo(int dias) {
        double salario= sueldoMensual/30;
        return salario*dias;
    }
}
