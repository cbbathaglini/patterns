package factoryabstract;

import factoryabstract.Forma;

public class Quadrado implements Forma {
    @Override
    public void desenhar() {
        System.out.println("Quadrado::desenhar()");
    }
}
