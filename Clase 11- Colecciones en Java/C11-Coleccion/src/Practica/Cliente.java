package Practica;

public class Cliente {
    public static void main(String[] args) {
        Puerto puerto= new Puerto();
        puerto.agregarContenedor(123,Pais.CHINA,false);
        puerto.agregarContenedor(2222,Pais.BRASIL,false);
        puerto.agregarContenedor(1,Pais.DESCONOCIDO,true);
        puerto.agregarContenedor(5,Pais.DESCONOCIDO,true);
        System.out.println("Contenedores ingresados:");
        puerto.mostrarContenedoresOrdenados();
        System.out.println("*****************");
        int cantPeligroso= puerto.contarContenedoresPeligrosos();
        System.out.println("Cantidad de contenedores D y P: "+cantPeligroso);
    }
}
