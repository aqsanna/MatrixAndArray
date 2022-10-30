package ExceptionExampl;

public class ThrowsDemo {
    static void throwOne() throws IllegalAccessError{
        System.out.println(" B теле метода throwOne () .");
        throw new IllegalAccessError("дeмoнcтpaция ");
    }

    public static void main(String[] args) {
        try{
            throwOne();
        }catch(IllegalAccessError e){
            System.out.println("Пepexвaчeнo исключение : "+ e);
        }
    }
}
