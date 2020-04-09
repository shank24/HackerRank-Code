package java8WithSelenium.com.udemy.java.lambda;

public class TestGreet {
    public static void main(String[] args) {

/*
        //Creating an implementation of the Interface (5 Lines)
        GreetingService g= new GreetingService() {
            @Override
            public void greet(String name) {
                System.out.println("Hi .." + name);
            }
        };
            g.greet("Cherry");
*/

        //Lambda Implementation (1 Line)
        GreetingService h= (fn,ln,age) -> {
            System.out.println("My Name is " + fn + " " + ln);
            System.out.println("My Age is " + age);
        };

            h.greet("Karanjeet", "Kalra",44);

    }

}
