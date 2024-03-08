package presencial;

public abstract class Cuenta {
    protected double saldo;


    public void depositar(double monto){
        saldo+=monto;// saldo= saldo+monto;
        System.out.println("deposito correcto");
    }
    public void informarSaldo(){
        System.out.println("Saldo actual: "+saldo);
    }
    public abstract double extraer(double monto);

}
