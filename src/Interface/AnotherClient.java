package Interface;

public class AnotherClient implements Callback {
    @Override
    public void callback(int p) {
        System.out.println("Eщe один вариант метода callback ()");
        System.out.println("p в квадрате равно \" + (р*р)");
    }
}
