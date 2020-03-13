package learning.generics;

import java.util.ArrayList;

public class WildCardParams {

    public static void main(String[] args) {
        WildCardParams wcp = new WildCardParams();

        wcp.myMethod(new ArrayList<String>());

        //myMethod1 is having ? extends Thread
        wcp.myMethod1(new ArrayList<Thread>());

        // My Class is extending Thread Class
        wcp.myMethod1(new ArrayList<MyClass>());

        // Because A is the super class of B
        wcp.myMethod2(new ArrayList<A>());
    }


    public void myMethod(ArrayList<?> l){
        l.add(null);
       //l.add("Cherry");

    }


    public void myMethod1(ArrayList<? extends Thread> l){
        l.add(null);
        //l.add("Cherry");

    }

    // Here it is allowing to add the instances of Class B,
    // because A is the superclass of B.
    public void myMethod2(ArrayList<? super B> l){
        l.add(null);
        l.add(new B());

    }
}
