package Ejercicio1;

public class Main {
    public static void main(String[] args) {
        EmpleadoEnRD empleadoEnRD= new EmpleadoEnRD("Jorgito",11111,3,1000.0,500.0);
        System.out.println(empleadoEnRD.cobroDeSalario());

        EmpleadoFL empleadoFL= new EmpleadoFL("Max", 10001,150.40,200);
        System.out.println(empleadoFL.cobroDeSalario());

        //polimorfismo
        //es la capacidad de un objeto de comportarse de manera diferente.
        Empleado empleado;
        empleado= empleadoEnRD;
        System.out.println("El empleado cobra su salario: "+empleado.cobroDeSalario());
        System.out.println("salario basico: "+empleadoEnRD.getSalarioBasico());
        System.out.println("le pido al empleado que cobre como FL");
        empleado= empleadoFL;
        System.out.println("El empleado cobra su salario: "+empleado.cobroDeSalario());

        //se llama casteo  , pero implicito(upcasting)---> pq sencillamente un empleadoRD es un empleado
        EmpleadoEnRD enRD= new EmpleadoEnRD("Juan",11,1,100.50,1.0);
        Empleado empleado1= enRD;
        System.out.println(empleado1.cobroDeSalario());

        //se llama casteo  , pero Explicito(downcasting)---> pq sencillamente un empleado es un empleadoRD--> descendente
        Empleado empleado2= new EmpleadoFL("Alberto",2,10.0,10);
        //new EmpleadoEnRD("Juan",11,1,100.50,1.0);
        if(empleado2 instanceof EmpleadoFL){//buena practica cuando se realiza casteo explicito
        EmpleadoFL empleadoFL1= (EmpleadoFL) empleado2; //aca estamos casteando
        System.out.println(empleado2.cobroDeSalario());}else{
            System.out.println("No pude castear Correctamente");
        }
        //instance of

        //new EmpleadoFL("Alberto",2,10.0,10);

        //casteos a variables
        double numDoble= 20.3;
        int  numInt= (int) numDoble;
        System.out.println("Numero Doble: "+numDoble+" parte Entera: "+numInt);
        String numeroString= Double.toString(numDoble); //20.3 --> veintepuntotres
        System.out.println(numeroString);
        String numeroString2= "123";
        int entero= Integer.parseInt(numeroString2);
        System.out.println(entero);
    }
}
