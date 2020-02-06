package learning.List;

import java.util.ArrayList;
import java.util.ListIterator;

public
class ListIteratorDemo {
    public static
    void main (String[] args) {
        ArrayList ar = new ArrayList ( );

        for (int i = 0; i < 10; i++) {
            ar.add ( i );
        }

        ListIterator listIterator = ar.listIterator ( );

        while (listIterator.hasNext ( )) {
            int i = (Integer) listIterator.next ( );
            System.out.print ( i + " " );

            if ( i % 2 == 0 ) {
                i++;
                listIterator.set ( i );
            }
        }
        System.out.println ( );
        System.out.println ( ar );


    }
}
