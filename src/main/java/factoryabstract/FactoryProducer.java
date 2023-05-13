package factoryabstract;

public class FactoryProducer
{
    public static FormaAbstractFactory getFactory(boolean arredondado){
        if (arredondado){
            return new FormaBordaArredondadaFactory();
        }
        return new FormaFactory();
    }
}
