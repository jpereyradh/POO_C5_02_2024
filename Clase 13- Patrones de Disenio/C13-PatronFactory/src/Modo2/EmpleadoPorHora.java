package Modo2;

public class EmpleadoPorHora extends Empleado {
    private double importePorHora, retencionImpuesto;


    public EmpleadoPorHora(double importePorHora, double retencionImpuesto) {
        this.importePorHora = importePorHora;
        this.retencionImpuesto = retencionImpuesto;
    }

    @Override
    public double calcularSueldo(int dias) {
        double salario= importePorHora*dias;
        return salario-retencionImpuesto;
    }
}
