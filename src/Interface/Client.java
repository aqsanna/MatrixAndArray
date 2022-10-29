package Interface;

public class Client implements  Callback {
    public void callback(int p){
        System.out.println("\"Метод cal lback (), вызываеNЫЙ со значением \" + р");
    }
    void nonifaceMeth(){
        System.out.println("Other method on the implements class");
    }
}
