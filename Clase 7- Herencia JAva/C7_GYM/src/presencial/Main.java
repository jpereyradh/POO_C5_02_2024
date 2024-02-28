package presencial;

public class Main {
    public static void main(String[] args) {
        SocioPileta socio1= new SocioPileta("Joaquin",0001,5000.0,"Musculacion",5000.0);
        
        System.out.println("calculo de cuota para el socio 1 S/M: "+socio1.calcularCostoMensual());
        System.out.println("**********************************************************************");
        System.out.println("calculo de cuota para el socio 1 C/M: "+socio1.calcularCostoMensual(0.10));

        System.out.println("*********************************************************************");
        socio1.habilitarSocio();
        System.out.println("calculo de cuota para el socio 1 S/M: "+socio1.calcularCostoMensual());
        System.out.println("**********************************************************************");
        System.out.println("calculo de cuota para el socio 1 C/M: "+socio1.calcularCostoMensual(0.10));

        System.out.println("***************************prueba de Getter y Setter");
        System.out.println("Valor de las cuotas: "+"GYM: "+socio1.getCuotaMensual()+" Pileta: "+socio1.getCostoPileta()+".- Sin impuestos");
        System.out.println("En mes de marzo los precios aumentan");
        socio1.setCostoPileta(6000.0);
        System.out.println("Nuevo valor de la pileta: "+socio1.getCostoPileta());
    }
}
