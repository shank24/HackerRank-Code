package java8WithSelenium.com.udemy.java.assignment.task1;

public class TestMain {

    public static void main(String[] args) {

        String exp="5 + 2 - 3 * 7 + 2 / 3 ^ 2 % 3";
        Calculator.addNewOperation("^",(a,b)-> (int)Math.pow(a,b));
        Calculator.addNewOperation("%",(a,b) -> (a%b));

        System.out.println(
                Calculator.calculate(exp)
        );



    }
}
