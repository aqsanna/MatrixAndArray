package Generik;

public class HierDemo2 {
    public static void main(String[] args) {
        Gen3<String> gn = new Gen3<String>("Hello", 47);
        System.out.println(gn.getOb());
        System.out.println(gn.num);
    }
}
