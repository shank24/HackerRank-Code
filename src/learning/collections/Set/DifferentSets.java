package learning.collections.Set;

import java.util.*;

public
class DifferentSets {
    public static
    void main (String[] args) {

        Random obj = new Random ( );

        HashSet <Integer> set = new HashSet <> ( );

        for (int i = 0; i <= 5; i++) {
            int number = obj.nextInt ( 1000 );
            set.add ( number );
            System.out.println (number );
        }

        System.out.println ( set );

        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet <> (  );

        for (int i = 0; i <=5 ; i++) {
            int number = obj.nextInt ( 1000 );
            linkedHashSet.add ( number );
            System.out.println (number );
        }
        System.out.println (linkedHashSet );

        // LinkedHashSet maintains order whereas HashSet does not.

        Set<Integer> set1 =new TreeSet <> (  );

        for (int i = 0; i <=5; i++) {
            int number = obj.nextInt ( 1000 );
            set1.add ( number );
            System.out.println (number );
        }
        System.out.println (set1 );
        // It sorts the elements in ascending order.



        Iterator<Integer> itr = set.iterator ();

        while (itr.hasNext ()){
            System.out.println (itr.next () );
            itr.remove ();
        }
    }

}
