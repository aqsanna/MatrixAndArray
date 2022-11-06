package Generik;

public class Gen3<T> extends NonGeno2 {
    T ob;
    Gen3(T o, int i) {
        super(i);
        ob = o;
    }
    T getOb(){
        return  ob;
    }
}
