package Interface;

public class Testiface {
    public static void main(String[] args) {
        Callback c = new Client();
        c.callback(42);
        AnotherClient ob = new AnotherClient();
        c = ob;
        c.callback(42);

    }
}
