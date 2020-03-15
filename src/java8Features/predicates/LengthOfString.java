package java8Features.predicates;

import java.util.function.Predicate;

public class LengthOfString {

    public static void main(String[] args) {
        Predicate<String> p =s->(s.length()>5);

        System.out.println(p.test("FDFDFDFD"));
        System.out.println(p.test("FDF"));
        System.out.println(p.test("FDFYT"));
        System.out.println(p.test("FDFDFDFDFDFDFDFD"));

    }
}
