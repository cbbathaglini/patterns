package factory;

public class FormaFactory {

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
