package builder;

import java.util.ArrayList;
import java.util.List;

public class Refeicao {
    private List<Item> itens = new ArrayList<>();

    public void addItem(Item item){
        System.out.println("Adicionando item...");
        this.itens.add(item);
    }

    public float getValor(){
        float precototal = 0.0f;
        for (Item i: itens) {
            precototal+=i.getPreco();
        }
        return precototal;
    }

    public void showItens(){

        for (Item i: itens) {
            System.out.println(i.getNome()+" | R$ "+i.getPreco()+" | "+i.getEmbalagem().embalar());
        }
    }
}
