package Modo1;

public class EmpleadoPorHoraFactory implements EmpleadoFactory{
    @Override
    public Empleado crearEmpleado(String parametro) {
        if("EMP-PH".equalsIgnoreCase(parametro)){
            return new EmpleadoPorHora(7,14);
        }else{
            throw new IllegalArgumentException("parametro PH no coincide");
        }

    }
}
