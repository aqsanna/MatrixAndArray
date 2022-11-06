package LambdaExpressions;

public class BlockLambdaDemo2 {
    public static void main(String[] args) {
        StringFunc revers = (str )-> {
            String result = "";
            int i;
            for (i = str.length() - 1; i >= 0; i--) {
                result += str.charAt(i);
            }
        return result;
    };
        System.out.println("Lambda reversed: " + revers.func("Lambda"));
        System.out.println("Expression reversed: " + revers.func("Expression"));
    }
}
