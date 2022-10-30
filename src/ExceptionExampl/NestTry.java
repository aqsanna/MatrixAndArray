package ExceptionExampl;

public class NestTry {
    public static void main(String[] args) {
        try{
            int a= 2;
            int b= 42/a;
            try{
                if(a==1){
                    a= a/(a-a);
                }
                if (a==2){
                    int [] c ={1};
                    c[42] =99;
                }
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println(" Индeкc за пределами массива : "+ e);
            }

        }catch(ArithmeticException e){
            System.out.println(" Дeлeниe на нуль : "+ e);
        }
    }
}
