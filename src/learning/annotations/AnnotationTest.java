package learning.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;


public class AnnotationTest {

    @MyAnnotation
    public void method(){
        System.out.println("DFDFDF");
    }
}
