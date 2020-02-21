package learning.collections.List;

import java.util.ArrayList;
import java.util.Iterator;

public
class ArrayListDemo {
    public static
    void main (String[] args) {
        ArrayList <Integer> list = new ArrayList <> ( );

        list.add ( 20 );
        list.add ( 10 );
        list.add ( 100 );
        //After java 1.5, because of Auto-boxing, we can add
        // anything in (INT,FLOAT,STRING)
        System.out.println ( list );

        Iterator<Integer> integerIterator = list.iterator ();

        while (integerIterator.hasNext ()){
            System.out.println (integerIterator.next () );
            integerIterator.remove ();
        }
        System.out.println (list );
    }
}
