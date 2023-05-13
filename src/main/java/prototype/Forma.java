package prototype;

public class Forma {
    private String id;
    public  String tipo;

    public Forma() {
    }

    public Forma(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public Object clone(){
        return this;
    }
}
