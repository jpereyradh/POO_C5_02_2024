package Modo1;

public class EmpleadoRelacionDependenciaFactory implements EmpleadoFactory{
    @Override
    public Empleado crearEmpleado(String parametro) {
        if("EMP-RD".equalsIgnoreCase(parametro)){
            return new EmpleadoRelacionDepencia(1000);
        }else{
            throw  new IllegalArgumentException("parametro RD no coincide");
        }

        }
}
