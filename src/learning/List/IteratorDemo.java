package learning.List;

import java.util.ArrayList;
import java.util.Iterator;

public
class IteratorDemo {

    public static
    void main (String[] args) {

        ArrayList a1 = new ArrayList ( );

        for (int i = 0; i < 10; i++) {
            a1.add ( i );
        }

        System.out.println ( "Elements of ArrayList " + a1 );

        Iterator iterator = a1.iterator ( );
        System.out.println ( "Starting Iterator" );

        while (iterator.hasNext ( )) {
            //System.out.println (iterator.next () );

            int i = (Integer) iterator.next ( );

            System.out.print ( i + " " );

            if ( i % 2 != 0 ) {
                iterator.remove ( );
            }


        }
        System.out.println ( );
        System.out.println ( "Even " + a1 );


    }
}
