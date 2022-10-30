package ExceptionExampl;

public class MultipleCatches {
    public static void main(String[] args) {
        try {
            int a = 1;
            System.out.println("a : " + a);
            int b = 42 / a;
            int[] c = {1};
            c[42] = 99;
        }catch(ArithmeticException e){
            System.out.println("Дeлeниe на нуль : "+ e);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Ошибка индексации за пределами массива : "+ e);
        }
        System.out.println("Пocлe блока операторов t ry/catch . ");
    }
}
