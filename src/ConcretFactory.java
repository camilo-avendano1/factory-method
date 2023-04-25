public class ConcretFactory extends AbstractFactory {

    @Override
    public IPay FactoryPago(CanalPago canaldepago) {
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
