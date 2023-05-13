package factoryabstract;

import factoryabstract.Circulo;
import factoryabstract.Forma;
import factoryabstract.Quadrado;
import factoryabstract.Triangulo;

public class FormaFactory  extends FormaAbstractFactory{

    public Forma getForma(String forma){
        if(forma!=null){
            switch (forma){
                case "QUADRADO":
                    return new Quadrado();
                case "TRIANGULO":
                    return new Triangulo();
                case "CIRCULO":
                    return new Circulo();
            }
        }
        return null;
    }
}
