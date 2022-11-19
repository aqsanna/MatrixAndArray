package LambdaExpressions;

public interface DoubleNumericArrayFunc {
    double func (double [] n) throws EmptyArrayException;
}

class EmptyArrayException extends Exception{
    EmptyArrayException(){
        super("Maccив nуст");
    }
}
