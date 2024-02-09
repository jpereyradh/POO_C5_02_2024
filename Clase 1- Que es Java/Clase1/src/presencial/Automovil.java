package presencial;

public class Automovil {
    public static void main(String[] args) {
        String marca= "Ford";
        char inicial= marca.charAt(0); //seria el metodo que nos devuelve la letra de acuerdo a la ubicacion que le asignemos
        int cantidadDePuertas= 4; //variable primitiva
        Integer anioDeFabricacion= 2024; /*Clase envolvente*/
        double capacidad= 400.4;
        Double capacidadCombustible= 40.5; //ctrl + click mouse

        System.out.println("***** Bienvenidos ******"); //sout

        System.out.println("Auto seleccionado: "+marca+" Inicial de la Marca: "+inicial+" Modelo: "+anioDeFabricacion);
        System.out.println("Capacidad de Combustible: "+capacidadCombustible);

    }



}
