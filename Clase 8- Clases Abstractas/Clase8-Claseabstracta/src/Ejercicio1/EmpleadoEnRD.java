package Ejercicio1;

public class EmpleadoEnRD extends Empleado {
    private Integer aniosDeAntiguedad;
    private Double salarioBasico;
    private Double premio;

    public EmpleadoEnRD(String nombre, int numeroDeEmpleado, Integer aniosDeAntiguedad, Double salarioBasico, Double premio) {
        super(nombre, numeroDeEmpleado);
        this.aniosDeAntiguedad = aniosDeAntiguedad;
        this.salarioBasico = salarioBasico;
        this.premio = premio;
    }

    public Double getSalarioBasico() {
        return salarioBasico;
    }

    @Override
    public Double cobroDeSalario() {
        for (int i = 0; i <10 ; i++) {
            System.out.println("calculando el sueldo RD");        }
        Double composicionSalarial= salarioBasico+premio+aniosDeAntiguedad;
        return composicionSalarial;
    }
}
