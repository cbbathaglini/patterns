package singleton;

public class Init {
    public static void main(String[] args) {
        SingleObject singleObject =  SingleObject.getInstance();
        singleObject.showMessage();
    }
}
