package Generik;

public class NonGenDemo {
    public static void main(String[] args) {
        NonGen iOb;
        iOb = new NonGen(88);
        iOb.showType();
        int v = (Integer) iOb.getOb();
        System.out.println("Value is; " + v);
        System.out.println();

        NonGen strObj = new NonGen("Generics test for the NonGen");
        strObj.showType();
        String str = (String) strObj.getOb();
        System.out.println("Value is : " + str);
       // iOb = strObj;
        v = (Integer) iOb.getOb();

    }
}
