package learning.generics;

public class MyClass extends Thread implements Comparable<String> {

    @Override
    public int compareTo(String s) {
        return 0;
    }
}
