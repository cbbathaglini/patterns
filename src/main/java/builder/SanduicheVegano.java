package builder;

public class SanduicheVegano extends Sanduiche {
    @Override
    public String getNome() {
        return "Sanduíche Vegano";
    }

    @Override
    public float getPreco() {
        return 16.2f;
    }
}
