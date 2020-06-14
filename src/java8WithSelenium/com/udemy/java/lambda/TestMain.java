package java8WithSelenium.com.udemy.java.lambda;

import java.util.ArrayList;
import java.util.List;

public class TestMain {

    private static final List<String> list = new ArrayList<>();

    public static void main(String[] args) {
        //Case 1
        //StringOperations op1 = (s) -> Objects.isNull(s);
        //StringOperations op1 = Objects::isNull;

        //Case 2
        //StringOperations op2 = (s) -> s.toUpperCase();
        //StringOperations op2 = String::toUpperCase;


        //Case 3
        //StringOperations op3 = (s1,s2) -> s1.concat(s2);
        //StringOperations op3 = String::concat;
        //System.out.println(op3.accept("udemy","good"));

        //Case 4
        //StringOperations op1 = (s)-> list.add(s);

        StringOperations op1 = list::add;

        op1.accept("Udemy");
        System.out.println(list);

    }
}
