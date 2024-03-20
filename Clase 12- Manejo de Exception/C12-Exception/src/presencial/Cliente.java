package presencial;

public class Cliente {
    private String apellido, nombre, cedula;
    private Double  deuda,limite;

    public Cliente(String apellido, String nombre, String cedula, Double limite) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.cedula = cedula;
        this.limite = limite;
        this.deuda = 0.0; //es el total
    }
     public void comprar(double importe) throws  ClienteException{
        if(importe>limite){
            //no puedo comprar, arrojo una exception
            throw new ClienteException("No se le permite comprar debido a que supera el limite establecido");
        }
        deuda+=importe;
        limite-=deuda;
         System.out.println("**********Compra exitosa**********");
     }
    public void saldarDeuda(double importe) throws ClienteException{
        if(deuda<=0){
            //vamos a lanzar una exception
            throw new ClienteException("No exite deuda para saldar");
        }if(importe<=0){
            //lanzar una exception
            throw new ClienteException("no puedo tener un importe menor igual a 0");
        }if(importe>deuda){
            System.out.println("Cuenta saldada");
            deuda=0.0;
            Double vuelto= importe-deuda;
            System.out.println("Su cambio es: "+vuelto);
        }
    }
}
