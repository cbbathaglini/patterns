package prototype;

public class Init {

    public static void main(String[] args) {
        FormaCache.carregaCache();

        Forma formaclonada = FormaCache.getForma("1");
        System.out.println("Forma 1: " + formaclonada.getTipo());

        Forma formaclonada3 = FormaCache.getForma("2");
        System.out.println("Forma 2: " + formaclonada3.getTipo());

        Forma formaclonada4 = FormaCache.getForma("3");
        System.out.println("Forma 3: " + formaclonada4.getTipo());
    }
}
