package Annotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

@What(description = "An annotation test class")
@MyAnno(str ="Meta2", val =99)
public class Meta2 {

    @What(description = "An annotation test method")
    @MyAnno(str ="Testing", val =100)
    public static void myMeth(){
        Meta2 meta2 = new Meta2();
        try{
            Annotation annos[] = meta2.getClass().getAnnotations();
            System.out.println("All annotations for Meta2: ");
            for(Annotation a : annos)
                System.out.println(a);
            System.out.println();
            Method m = meta2.getClass().getMethod("myMeth");
            annos = m.getAnnotations();
            System.out.println("All annotations for method");
            for(Annotation a : annos){
                System.out.println(a);
            }
        } catch (NoSuchMethodException e) {
            System.out.println("Method not found");
        }

    }

    public static void main(String[] args) {
        myMeth();
    }
}
