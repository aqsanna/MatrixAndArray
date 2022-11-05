package Enum;

public class AutoBox5 {
    public static void main(String[] args) {
        Boolean b = true;
        if(b) System.out.println("b is true");
        Character ch = 'X';
        Character character = ch;
        System.out.println("character is  "+ character);
    }
}
