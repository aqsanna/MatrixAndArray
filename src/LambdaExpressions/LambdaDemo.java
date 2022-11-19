package LambdaExpressions;

public class LambdaDemo {
    public static void main(String[] args) {
        MyNumber myNumber;
        myNumber = ()-> 123.45;
        System.out.println("Фиксированное значение :" + myNumber.getValue());

        myNumber = () -> Math.random() * 100;
        System.out.println("Cлyчaйнoe значение :" + myNumber.getValue());
        System.out.println("Еще одно случайное значение :" + myNumber.getValue());
    }
}
