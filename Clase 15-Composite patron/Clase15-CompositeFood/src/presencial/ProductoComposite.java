package presencial;
//composite

import java.util.ArrayList;
import java.util.List;

public class ProductoComposite extends Producto {
    private List<Producto> productos;
    public ProductoComposite(String nombre) {
        super(nombre, 0); //incialmente un combo vale 0
        productos= new ArrayList<>();
    }
    public void agregarProducto(Producto producto){
        productos.add(producto);
    }
    public void eliminarProducto(Producto producto){
        productos.remove(producto);
    }

    @Override
    public double getPrecio() {
        double totalCombo=0;
        for (Producto producto : productos) { //por cada producto
            totalCombo+=producto.getPrecio(); //suma y acumulacion

        }
        return totalCombo*0.85; //15% off
    }
}
