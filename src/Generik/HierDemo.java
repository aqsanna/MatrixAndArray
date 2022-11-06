package Generik;

public class HierDemo {
    public static void main(String[] args) {
        Gen2<String, Integer> x = new Gen2<String, Integer>("Value is: ", 99);
        System.out.println(x.getOb());
        System.out.println(x.getOb2());
    }
}
