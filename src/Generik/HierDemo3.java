package Generik;

public class HierDemo3 {
    public static void main(String[] args) {
        Gen<Integer> iOb = new Gen<Integer>(88);
        Gen4<Integer> iOb2 = new Gen4<Integer>(99);
        Gen4<String> strOb2 = new Gen4<String>("Generics test");
        if(iOb2 instanceof Gen4<?>);
        System.out.println("iOb2 instanceof Gen4");
        if(iOb2 instanceof  Gen<?>);
        System.out.println("iOb2 instanceof Gen");
        System.out.println();
        if(strOb2 instanceof Gen4<?>);
        System.out.println("strOb2 instanceof Gen4");
        if(strOb2 instanceof Gen<?>);
        System.out.println("strOb2 instanceof Gen");
        System.out.println();
        if(iOb instanceof Gen<?>);
        System.out.println("iOb instanceof Gen");
        if(iOb instanceof Gen4<?>);
        System.out.println("iOb instanceof Gen4");
    }
}
