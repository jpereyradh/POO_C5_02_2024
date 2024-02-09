package presencial;

import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
        //para crear el objeto lo primero que debemos hacer es llamar al tipo de dato
        Scanner scanner = new Scanner(System.in); //constructor
        System.out.println("*******--Inscripciones a Examenes CTD--*********");
        System.out.println("Ingrese nombre del estudiante: ");
        String nombre= scanner.nextLine();
        char inicial= primeraLetra(nombre);
        char letraFinal= ultimaLetra(nombre);
        System.out.println("Ingrese la matricula numerica: ");
        Integer matricula= scanner.nextInt();
        System.out.println("Ingrese su edad: ");
        int edad= scanner.nextInt();
            System.out.println("ingrese la nota anterior: ");
            double nota= scanner.nextDouble();
            scanner.close();
        if(edad>=18){
            System.out.println("Es mayor de Edad");
            System.out.println("Verifique los datos ingresados: ");
            System.out.println(nombre+" ,"+matricula+", "+edad+", "+nota);
            System.out.println("Letra Inicial: "+inicial+" Ultima Letra : "+letraFinal);
        }else {
            System.out.println("es menor de edad");
        }

    }
    public static char primeraLetra(String nombre){
        return nombre.charAt(0);
    }
    public static char ultimaLetra(String nombre){
        /* STRING NOMBRE=   J O R G E L I N A -9-> CADENA DE STRING
        INDEX--> UBICACION  0 1 2 3 4 5 6 7 8 -8-> TOTAL -1
        * */
    return nombre.charAt(nombre.length()-1);
    }

}
