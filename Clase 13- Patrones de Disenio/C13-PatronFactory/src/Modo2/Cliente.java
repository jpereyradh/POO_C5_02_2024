package Modo2;

import Modo2.EmpleadoFactory;

import java.util.Scanner;

public class Cliente {
    public static void main(String[] args) {
        System.out.println("Bienvenidos a la calculadora de salarios: ");
        Scanner scanner= new Scanner(System.in);
        System.out.println("Ingrese el tipo de empleado: ");
        String tipo= scanner.nextLine();
        try{
            Empleado empleado= EmpleadoFactory.crearEmpleado(tipo);
            System.out.println("Ingrese los dias: ");
            int dias= scanner.nextInt();
            System.out.println("saladio : "+empleado.calcularSueldo(dias));
        }catch (IllegalArgumentException ex){
            System.err.println(ex.getMessage());
        }finally {
            try{
                scanner.close();

            }catch (Exception e){
                e.getStackTrace();
            }
        }
    }
}
