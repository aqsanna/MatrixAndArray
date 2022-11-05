package Enum;

public class EnumDemo3 {
    public static void main(String[] args) {
        Apple ap;
        System.out.println("Winsap coast " + Apple.Winsap.getPrice());

        System.out.println("All apple prices: ");
        for(Apple a : Apple.values()){
            System.out.println(a + " costs " + a.getPrice());
        }

    }


}
