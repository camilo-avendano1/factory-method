import java.util.Random;

public class Cliente {
    public static void main(String[] args) throws InterruptedException {
        IPay pago=null;
        Random rnd = new Random();
        ConcretFactory pagoConcreto = new ConcretFactory();
        Integer opc = 0;

        for(;;){
            opc = rnd.nextInt(4);
            switch (opc) {
                case 0:
                    pago = pagoConcreto.FactoryPago(Canal_pago.pse);
                    break;
                case 1:
                    pago = pagoConcreto.FactoryPago(Canal_pago.wompi);
                    break;
                case 2:
                    pago = pagoConcreto.FactoryPago(Canal_pago.bancolombia);
                    break;
                case 3:
                    pago = pagoConcreto.FactoryPago(Canal_pago.otro);
                    break;
            }
        pago.pagar();
        Thread.sleep(1000);
        }
    }
}