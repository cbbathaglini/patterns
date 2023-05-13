package builder;

public class Refrigerante extends BebidaGelada{

    @Override
    public String getNome() {
        return "Refrigerante";
    }

    @Override
    public float getPreco() {
        return 8.9f;
    }
}
