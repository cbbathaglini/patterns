package builder;

public class Init {
    public static void main(String[] args) {
        RefeicaoBuilder refeicaoBuilder = new RefeicaoBuilder();

        Refeicao refeicaoVegana = refeicaoBuilder.refeicaoVegana();
        System.out.println("Refeição vegana");
        refeicaoVegana.showItens();
        System.out.println("Preço total = "+ refeicaoVegana.getValor());


        Refeicao refeicaoNaoVegana = refeicaoBuilder.refeicaoNaoVegana();
        System.out.println("Refeição não vegana");
        refeicaoNaoVegana.showItens();
        System.out.println("Preço total = "+ refeicaoNaoVegana.getValor());
    }
}
