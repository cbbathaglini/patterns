package builder;

public abstract class Sanduiche implements Item {

    @Override
    public abstract float getPreco();


    @Override
    public Embalagem getEmbalagem() {
        return new Pacote();
    }
}
