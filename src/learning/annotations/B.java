package learning.annotations;

import java.util.ArrayList;
import java.util.List;

public class B {

    @SuppressWarnings({"deprecation", "rawtypes"})
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a);
        a.myMethod();
        System.out.println(a.val);


        List l = new ArrayList();
        System.out.println(l);

    }
}
