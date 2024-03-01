package Ejercicio1;

public class EmpleadoFL extends Empleado {
    private Double costoPorHora;
    private Integer cantidadDeHora;

    public EmpleadoFL(String nombre, int numeroDeEmpleado, Double costoPorHora, Integer cantidadDeHora) {
        super(nombre, numeroDeEmpleado);
        this.costoPorHora = costoPorHora;
        this.cantidadDeHora = cantidadDeHora;
    }

    @Override
    public Double cobroDeSalario() {
        for (int i = 0; i <10 ; i++) {
            System.out.println("calculando el salario de un Freelance");
        }
        Double pago= cantidadDeHora*costoPorHora;
        return pago;
    }
}
