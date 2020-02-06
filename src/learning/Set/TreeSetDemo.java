package learning.Set;

import java.util.ArrayList;
import java.util.TreeSet;

public
class TreeSetDemo {

    public static
    void main (String[] args) {
        TreeSet treeSet = new TreeSet ( );

        treeSet.add ( 1 );
        treeSet.add ( 2 );
        treeSet.add ( 4 );
        treeSet.add ( 7 );
        treeSet.add ( 6 );
        treeSet.add ( 5 );

        System.out.println (treeSet );

        System.out.println (treeSet.ceiling (3));

        System.out.println (treeSet.descendingSet ());

        ArrayList arrayList = new ArrayList (  );

        for (int i = 10; i >=0 ; i--) {
            arrayList.add ( i );
        }

        TreeSet set = new TreeSet ( arrayList );
        System.out.println (set );

        System.out.println (set.last () );
        System.out.println (set.pollLast () );
        System.out.println (set.tailSet ( 3) );
        System.out.println (set.headSet ( 6) );

    }
}
