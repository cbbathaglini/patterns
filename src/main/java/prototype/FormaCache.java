package prototype;

import java.util.HashMap;
import java.util.Hashtable;

public class FormaCache {
    private static Hashtable<String, Forma> formaMap = new Hashtable<String, Forma>();

    public static Forma getForma(String idForma){
        Forma forma = formaMap.get(idForma);
        return (Forma) forma.clone();
    }

    public static void carregaCache(){
        Circulo circulo = new Circulo();
        circulo.setId("1");
        formaMap.put(circulo.getId(),circulo);

        Quadrado quadrado = new Quadrado();
        quadrado.setId("2");
        formaMap.put(quadrado.getId(),quadrado);

        Triangulo triangulo = new Triangulo();
        triangulo.setId("3");
        formaMap.put(triangulo.getId(),triangulo);


    }
}
