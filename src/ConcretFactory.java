public class ConcretFactory extends Abstract_factory {

    @Override
    public IPay FactoryPago(Canal_pago canaldepago) {
        switch (canaldepago){
            case pse:
                return  new PSE();
            case wompi:
                return new Wompi();
            case bancolombia:
                return new Bancolombia();
            case otro:
                return new Otro();
        }
        return null;
    }
}
