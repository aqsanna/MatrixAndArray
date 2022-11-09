package String;



public class MyStringExam {
    public static void main(String[] args) {
        String str ="abc";
        String str1 = "aBc";
        String str2 = "abd";
        char c = 'a';
        char [] ar ={'a', 'b', 'k','n'};
        char ch  = str.charAt(1);
        String str3 =" ";
        String str4 ="";
        String str5 ="abscabsswas";
        String str6 = "      Hello Bello     +  lk  ";
        String str7 = "Welcome to QA Java";
        String str8 = "WELCOME TO HOME";
        String str9 = "welcome to home2";
        String str10 = "45";
        Boolean b = true;
        Character c1;
        char ch1 = 'H';
        Double d = 48.54;
        Float f = 102.555F;
        Integer i = 748;
        Long l = 7847L;
        System.out.println(ch);
        System.out.println(str.compareTo(str2));
        System.out.println(str.compareToIgnoreCase(str1));
        System.out.println(str.concat(str1));
        System.out.println(str.contains(str1));
        System.out.println(str1.contentEquals(str2));
        String copy = str.copyValueOf(ar);
        System.out.println(copy);
        String copy2 = str.copyValueOf(ar, 1,2);
        System.out.println(copy2);
        System.out.println(str.endsWith("c"));  // inchi exav false?
        System.out.println(str.equals(str1));
        System.out.println(str.equalsIgnoreCase(str1));
        System.out.println(str.indexOf("b"));
        System.out.println(str3.isBlank());
        System.out.println(str4.isEmpty());
        System.out.println(str5.lastIndexOf("a"));
        System.out.println(str5.lastIndexOf("bs", 7));
        System.out.println(str5.length());
        System.out.println(str5.replace("a", "K"));
        System.out.println(str5.replaceAll("abs", "barev"));
        System.out.println(str5.replaceFirst("abs", "hajox"));
        System.out.println(str2.startsWith("a"));
        System.out.println(str5.startsWith("s", 6));
        System.out.println(str6);
        String strip = str6.strip();
        System.out.println(strip);
        String subString = str6.substring(8);
        System.out.println(subString);
        String subStringIndex = str6.substring(8,10);
        System.out.println(subStringIndex);
        char [] at = str7.toCharArray();
        System.out.println(at);
        String lower = str8.toLowerCase();
        System.out.println(lower);
        String upper = str9.toUpperCase();
        System.out.println(upper);
        String tostring = str10.toString();
        System.out.println(tostring);
        String trim = str6.trim();
        System.out.println(trim);
        Boolean valueOfB = Boolean.valueOf(b);
        System.out.println(valueOfB);
        Character valueOFC = Character.valueOf(ch1);
        System.out.println(valueOFC);
        String valueOFCII = String.valueOf(ar, 0, 3);
        System.out.println(valueOFCII);
        System.out.println(Double.valueOf(d));
        System.out.println(Float.valueOf(f));
        System.out.println(Integer.valueOf(i));
        System.out.println(Long.valueOf(l));




    }

}
