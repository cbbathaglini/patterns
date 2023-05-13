package factoryabstract;

import factoryabstract.Forma;

public class Triangulo implements Forma {
    @Override
    public void desenhar() {
        System.out.println("Triângulo::desenhar()");
    }
}
