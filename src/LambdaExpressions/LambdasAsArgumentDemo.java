package LambdaExpressions;

public class LambdasAsArgumentDemo {
    static String stringOp(StringFunc sf, String s){
        return  sf.func(s);
    }

    public static void main(String[] args) {
        String iпStr = "Лямбда - выражения повышают эффективность Java ";
        String outStr;
        System.out.println( "Этo исходная строка : "+ iпStr);

        outStr = stringOp ( ( str ) -> str.toUpperCase(), iпStr) ;
        System.out.println ( " Этo строка в верхнем регистре : "+ outStr);

        outStr = stringOp ( ( str) -> {
            String result = "";
            int i;
            for (i = 0; i < str.length(); i++)
                if (str.charAt(i) != ' ')
                    result += str.charAt(i);
            return result;
        }, iпStr );
            System.out .println ( " Этo с трока с удаленными пробелами : " + outStr) ;
     }
}
