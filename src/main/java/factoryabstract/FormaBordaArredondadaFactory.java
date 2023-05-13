package factoryabstract;


public class FormaBordaArredondadaFactory extends FormaAbstractFactory{
    public Forma getForma(String forma){
        if(forma!=null){
            switch (forma){
                case "QUADRADO_BORDA_ARREDONDADA":
                    return new QuadradoBordaArredondada();
                case "TRIANGULO_BORDA_ARREDONDADA":
                    return new TrianguloBordaArredondada();
            }
        }
        return null;
    }
}
