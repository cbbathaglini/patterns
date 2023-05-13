package factoryabstract;

import factoryabstract.Forma;

public class Circulo implements Forma {
    @Override
    public void desenhar() {
        System.out.println("Circulo::desenhar()");
    }
}
