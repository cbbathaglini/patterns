package factory;

public class Init {

    public static void main(String[] args) {
        FormaFactory formaFactory = new FormaFactory();

        Forma quadrado = formaFactory.getForma("QUADRADO");
        quadrado.desenhar();

        Forma circulo = formaFactory.getForma("CIRCULO");
        circulo.desenhar();

        Forma triangulo = formaFactory.getForma("TRIANGULO");
        triangulo.desenhar();
    }
}
