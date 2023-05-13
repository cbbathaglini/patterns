package factoryabstract;

import factoryabstract.Forma;

public class QuadradoBordaArredondada implements Forma {
    @Override
    public void desenhar() {
        System.out.println("QuadradoBordaArredondada::desenhar()");
    }
}
