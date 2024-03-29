package presencial;

import java.util.ArrayList;
import java.util.List;

public class CarritoDeCompra {
    private List<Producto> productosLista= new ArrayList<>();

    public void agregarProducto(Producto producto){
        productosLista.add(producto);
    }
    public double totalCarrito(){
        double total=0;
        for (Producto producto : productosLista) {
            total+= producto.getPrecio();
        }
        return total;
    }
}
