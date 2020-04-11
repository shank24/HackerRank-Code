package java8WithSelenium.com.udemy.java.functionalInterfaces.supplier;

import java.util.function.Supplier;

public class TestSupp {

    public static void main(String[] args) {

        // Does not take any input, so the input will be blank
        //Supplier<Double> random = () -> Math.random();
        Supplier<Double> random = Math::random;
        System.out.println(random.get());
    }
}
