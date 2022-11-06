package Generik;

public class Gen2<T, V> extends  Gen<T>{
    T ob2;
    Gen2(T o, V o2) {
        super(o);
        ob2 = (T) o2;
    }
    V getOb2(){
        return (V) ob2;
    }
}
