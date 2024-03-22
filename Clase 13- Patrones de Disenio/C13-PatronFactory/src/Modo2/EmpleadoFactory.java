package Modo2;

public abstract class EmpleadoFactory {

   public static Empleado crearEmpleado(String tipo){
       if("EMP-PH".equalsIgnoreCase(tipo)){
           return new EmpleadoPorHora(7,14);
       } else if ("EMP-RD".equalsIgnoreCase(tipo)) {
           return new EmpleadoRelacionDepencia(1000);
                  }
       else {
           throw  new IllegalArgumentException("Paramtros no coincidentes");
       }
   }
}
