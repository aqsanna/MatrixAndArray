package LambdaExpressions;

public class MethodRefDemo {
    static  String stringOp(StringFunc sf, String s){
        return  sf.func(s);
    }

    public static void main(String[] args) {
        String inStr = "Лямбда- выражения повышают эффективность Java ";
        String outStr;
        outStr = stringOp(MyStringOps:: strRevers, inStr);
        System.out.println("Иcxoднaя строка :" + inStr);
        System.out.println("Oбpaщeннaя строка :" + outStr);

    }
}
