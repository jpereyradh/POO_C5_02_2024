package presencial;

public class Main {
    public static void main(String[] args) {
        CajaCorriente cuenta= new CajaCorriente();
        cuenta.depositar(1000);
        cuenta.informarSaldo();
        cuenta.gravar(5);
        cuenta.informarSaldo();
        cuenta.extraer(1000);
        cuenta.informarSaldo();

    }
}
