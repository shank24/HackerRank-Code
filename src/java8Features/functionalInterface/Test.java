package java8Features.functionalInterface;

public class Test {

    public static void main(String[] args) {

        A ob = new C();
        ob.myMethod();

        // Via Lambda

        A a = () -> System.out.println("Inside My Lambda");
        a.myMethod();
    }
}
