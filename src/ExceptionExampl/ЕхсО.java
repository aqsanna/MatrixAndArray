package ExceptionExampl;

public class ЕхсО {
    static  void subRoutin(){
        try{
            int d=0;
            int a = 10/d;
            System.out.println(" Этo не будет выведено .");
        }catch(ArithmeticException e){
            System.out.println("Дeлeниe на нуль.");
        }
        System.out.println("Пocлe оператора catch.");

    }

    public static void main(String[] args) {
        subRoutin();
    }
}
