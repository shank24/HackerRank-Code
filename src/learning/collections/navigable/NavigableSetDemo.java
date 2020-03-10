package learning.collections.navigable;

import java.util.TreeSet;

public class NavigableSetDemo {

    public static void main(String[] args) {
        TreeSet<Integer> s = new TreeSet<>();

        s.add(10);
        //s.add(20);
        s.add(30);
        s.add(40);
        s.add(50);
        s.add(60);

        System.out.println(s);

        System.out.println(s.ceiling(20));

        //The lowest element which is higher than 40 is 50
        System.out.println(s.higher(40));
        System.out.println(s.floor(10));
        System.out.println(s.lower(30));
        System.out.println(s.pollFirst());
        System.out.println(s.pollLast());
        System.out.println(s.descendingSet());


    }

}
