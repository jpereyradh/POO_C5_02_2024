package Practica;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Puerto {
    private List<Contenedor> contenedores;


    public Puerto() {
        contenedores= new ArrayList<>();
    }
    public void agregarContenedor(int numero, Pais procedencia, Boolean esPeligroso){
        Contenedor contenedor= new Contenedor(numero,procedencia,esPeligroso);
        contenedores.add(contenedor);
    }
    public void mostrarContenedoresOrdenados(){
        Collections.sort(contenedores, Comparator.comparingInt(Contenedor::getNumero));
        for (Contenedor contenedor : contenedores) {
            System.out.println(contenedor);

        }
    }
    public int contarContenedoresPeligrosos(){
        int contador=0;
        for (Contenedor contenedor : contenedores) {
            if(contenedor.getEsPeligroso()&&contenedor.getProcedencia()==Pais.DESCONOCIDO){
                contador++;
            }
        }
        return contador;
    }
}
