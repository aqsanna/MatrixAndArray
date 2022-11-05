package Enum;

public class EnumDemo {
    public static void main(String[] args) {
        Apple ap;
        ap=Apple.RedDel;
        System.out.println("Value of ap " + ap);
        System.out.println();
        ap = Apple.GoldenDel;
        if(ap == Apple.GoldenDel){
            System.out.println("ap contains GoldenDel.\n");
        }
        switch (ap){
            case Jonhatan:
                System.out.println("Jonhatan is red");
                break;
            case GoldenDel:
                System.out.println("Golden is yello");
                break;
            case RedDel:
                System.out.println("Red is red");
                break;
            case Winsap:
                System.out.println("Winesap is red");
                break;
            case Cortland:
                System.out.println("Cortland is red");
                break;
        }
    }
}
