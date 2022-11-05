package Generik;

import java.util.function.DoubleToIntFunction;

public class GenDemo {
    public static void main(String[] args) {
        Gen<Integer> iOb;
        iOb= new Gen<Integer>(88);
        iOb.showType();

        int v = iOb.getOb();
        System.out.println("Value is : " + v);
        System.out.println();

        Gen<String> strOb =new Gen<String>("Generics test");
        strOb.showType();
        String str = strOb.getOb();
        System.out.println("Value is : " + str);
        //iOb=strOb;
    }
}
