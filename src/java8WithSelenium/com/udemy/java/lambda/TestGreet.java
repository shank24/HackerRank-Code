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

        /*//Lambda Implementation (1 Line)
        GreetingService h= (fn,ln,age) -> {
            System.out.println("My Name is " + fn + " " + ln);
            System.out.println("My Age is " + age);
        };

            h.greet("Karanjeet");
*/

        //GreetingService g = (n) -> n.toUpperCase();

        //System.out.println(g.greet("fdfdfdfdd"));

        //test(g);
        //test(j->j.toLowerCase()+" " + j.toUpperCase() + " " + j.length());




        test(n -> {
            System.out.println("Inside Lambda");
            return n.toUpperCase();
        });

        String s = getLambda().greet("gdfdgd");
        System.out.println(s);
    }



    private static void test(GreetingService g){
        System.out.println("Inside Test Method -> Received Greeting Service ");
        String returnStr = g.greet("udemy");
        System.out.println(returnStr);
    }

    private static GreetingService getLambda(){
        // Functions as First Class Objects
         //GreetingService g = (s) -> s.toUpperCase();
         return g->g.toUpperCase();
    }
}
