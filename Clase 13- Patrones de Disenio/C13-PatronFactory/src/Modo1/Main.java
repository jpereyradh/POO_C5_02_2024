package Modo1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenidos a la calculadora de salarios: ");
        Scanner scanner= new Scanner(System.in);
        System.out.println("Ingrese el tipo de empleado: ");
        String tipo= scanner.nextLine();
        if(tipo.equalsIgnoreCase("EMP-PH")){
              EmpleadoFactory factoryPH= new EmpleadoPorHoraFactory();
            Empleado empleadoPH= factoryPH.crearEmpleado(tipo);
            System.out.println("Cuantos dias trabajo el empleado?: ");
            int dias= scanner.nextInt();
           System.out.println("Salario PH: "+empleadoPH.calcularSueldo(dias));
        } else if (tipo.equalsIgnoreCase("EMP-RD")) {
            EmpleadoFactory factoryRD= new EmpleadoRelacionDependenciaFactory();
            Empleado empleadoRD= factoryRD.crearEmpleado(tipo);
            System.out.println("Cuantos dias trabajo el empleado?: ");
            int dias= scanner.nextInt();
            System.out.println(" Salario RD: "+empleadoRD.calcularSueldo(dias));

        }else{
            System.out.println("el tipo no corresponde");
        }
        scanner.close();
    }
}
