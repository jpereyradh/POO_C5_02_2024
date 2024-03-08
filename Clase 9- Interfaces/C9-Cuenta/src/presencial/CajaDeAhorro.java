package presencial;

public class CajaDeAhorro extends Cuenta {
    private  final double interesGanado=1.2;

    public void GenerarInteres(){
        saldo+=saldo*(interesGanado/100);
    }

    @Override
    public double extraer(double monto) {
        if(monto<=saldo){
            System.out.println("Extraccion correcta");
            saldo-=monto;
            return saldo;
        }else{
            System.out.println("saldo insuficiente");
            return saldo;
        }

    }
}
