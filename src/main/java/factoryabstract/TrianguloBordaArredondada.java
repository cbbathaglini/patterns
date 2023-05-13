package factoryabstract;

import factoryabstract.Forma;

public class TrianguloBordaArredondada implements Forma {
    @Override
    public void desenhar() {
        System.out.println("TrianguloBordaArredondada::desenhar()");
    }
}
