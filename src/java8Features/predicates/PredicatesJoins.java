package java8Features.predicates;

import java.util.function.Predicate;

public class PredicatesJoins {
    public static void main(String[] args) {
        int [] a = {0,1,2,3,4,5,6,10,20,30,73,55};

        Predicate<Integer> p1 = i->(i>10);
        Predicate<Integer> p2 = i->(i%2==0);

        System.out.println("Greater Than 10: ");
        method1(p1,a);

        System.out.println("Even Numbers : ");
        method1(p2,a);

        System.out.println("Numbers not greater than 10: ");
        method1(p1.negate(),a);

        System.out.println("Odd Numbers : ");
        method1(p2.negate(),a);

        System.out.println("Numbers greater than 10 AND Even");
        method1(p1.and(p2),a);

        System.out.println("Numbers greater than 10 AND Odd");
        method1(p1.and(p2.negate()),a);

        System.out.println("Numbers greater than 10 OR Even");
        method1(p1.or(p2),a);




    }

    static void method1(Predicate<Integer> p,int[] a){
        for (int eachValue:a) {
            if(p.test(eachValue))
                System.out.println(eachValue);
        }
    }




}
