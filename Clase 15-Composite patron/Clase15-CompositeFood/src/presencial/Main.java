package presencial;

public class Main {
    public static void main(String[] args) {
        Producto burger= new Sandwich("tiple bacon",100);
        Producto papa= new Acompanamiento("papa brava",20);

        System.out.println("Precio de Cada producto: burger $"+burger.getPrecio()+"-papa:$"+papa.getPrecio());

        CarritoDeCompra carritoDeCompra= new CarritoDeCompra();


        ProductoComposite combo= new ProductoComposite("DH FOOD");
        combo.agregarProducto(burger);
        combo.agregarProducto(papa);
        combo.agregarProducto(new Bebida("inka cola",20));
        carritoDeCompra.agregarProducto(combo);
        carritoDeCompra.agregarProducto(new Sandwich("Arepa",45));
        System.out.println("Total del carrito C/C: "+carritoDeCompra.totalCarrito());
        System.out.println("Total combo: "+combo.getPrecio()+" Se aplica 15% off");


    }
}
