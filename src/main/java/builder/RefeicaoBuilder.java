package builder;

public class RefeicaoBuilder {
    public Refeicao refeicaoVegana(){
        Refeicao refeicaovegana = new Refeicao();
        refeicaovegana.addItem(new SanduicheVegano());
        refeicaovegana.addItem(new Refrigerante());
        return  refeicaovegana;
    }

    public Refeicao refeicaoNaoVegana(){
        Refeicao refeicaoNaoVegana = new Refeicao();
        refeicaoNaoVegana.addItem(new SanduicheFrango());
        refeicaoNaoVegana.addItem(new Suco());
        return  refeicaoNaoVegana;
    }
}
