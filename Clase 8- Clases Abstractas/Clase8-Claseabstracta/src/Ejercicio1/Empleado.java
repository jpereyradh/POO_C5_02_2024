package Ejercicio1;
//UNA CLASE ABSTRACA ENTIENDASE COMO UN MODELO DE CLASE, COMO UNA PLANTILLA DE CLASE.
//por que una clase abstracta no se puede instanciar de manera directa.
// sino atraves de los hijos.(sub clase)
public abstract   class Empleado {
    private String nombre;
    private int numeroDeEmpleado;

    public Empleado(String nombre, int numeroDeEmpleado) {
        this.nombre = nombre;
        this.numeroDeEmpleado = numeroDeEmpleado;
    }
//es un metodo que nos permite instanciar o crear un objeto.


    /*public Double cobroDeSalario(Double basico, Integer anios){
            return null;
                }
        public Double cobroDeSalario(Integer cant, Double valorPorHOra){
            return null;
    }*/
   public abstract Double cobroDeSalario();
}
