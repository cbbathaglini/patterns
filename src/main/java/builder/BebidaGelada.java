package builder;

public abstract class BebidaGelada implements Item {

    @Override
    public abstract float getPreco();

    @Override
    public Embalagem getEmbalagem() {
        return new Garrafa();
    }
}
