package presencial;

public class Main {
    public static void main(String[] args) {
        Cliente cliente= new Cliente("Tovares","Lorena","1111",100.0);
        try{
            cliente.comprar(50.0);
            int x=10/0;

        }catch (ClienteException exception){
            System.err.println(exception.getMessage());
        }catch (ArithmeticException ar){
            System.err.println(ar.getMessage());
        }
         //por que en este punto el sistema no sabe que hacer.
        System.out.println("continuaria mi sistema");


    }
}
