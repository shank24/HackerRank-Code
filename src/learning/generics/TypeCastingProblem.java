package learning.generics;

import java.util.ArrayList;
import java.util.List;

public class TypeCastingProblem {
    public static void main(String[] args) {

        String[] s = new String[10];
        s[0]="John";
        s[1]="FDF";

        List l = new ArrayList<>();
        l.add("WEEW");
        l.add("FDFD");
        l.add(123);


        // This will throw an exception,
        // because we are adding Integer to List
        // And retrieving it from the list.

        // So, as to avoid the type casting, Generics were
        // introduced and they are used with <String>
        String name = (String) l.get(2);


    }
}
