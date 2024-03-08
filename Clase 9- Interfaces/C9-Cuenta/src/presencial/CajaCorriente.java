package presencial;

public class CajaCorriente extends Cuenta implements ImpuestoGravable{
    private double descubiertoPermitido=100;
    @Override
    public double extraer(double monto) {
        double montoExtra= saldo+descubiertoPermitido;
        if(monto<=montoExtra){
            System.out.println("El banco le permite extraer");
            saldo=-monto; //aca hay que reparar.
            return saldo;

        }else{
            System.out.println("no se permite la operacion que desea realizar");
            return saldo;

        }
    }

    @Override
    public double gravar(double porcentaje) {
        saldo-=saldo*(porcentaje/100);
        System.out.println("impuesto Gravado");
        return saldo;
    }

    
}
