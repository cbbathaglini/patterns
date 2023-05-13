package factoryabstract;

import factoryabstract.Forma;
import factoryabstract.FormaFactory;

public class Init {

    public static void main(String[] args) {
        FormaAbstractFactory formaFactory = FactoryProducer.getFactory(true);

        Forma quadrado = formaFactory.getForma("QUADRADO");
        quadrado.desenhar();

        Forma circulo = formaFactory.getForma("CIRCULO");
        circulo.desenhar();

        Forma triangulo = formaFactory.getForma("TRIANGULO");
        triangulo.desenhar();
    }
}
