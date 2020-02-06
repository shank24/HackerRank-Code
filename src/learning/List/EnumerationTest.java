package learning.List;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public
class EnumerationTest {
    public static
    void main (String[] args) {

        // Create a Vector and print its contents
        Vector v = new Vector ( );
        for (int i = 0; i < 10; i++) {
            v.addElement ( i );
        }

        v.addElement ( 1 );
        Iterator iterator = v.iterator ();
        while (iterator.hasNext ()){
            System.out.println (iterator.next () );
        }

        System.out.println ( v );

        // At beginning e(cursor) will point to
        // index just before the first element in v
        Enumeration e = v.elements ( );

        //Checking the next element availabilty

        while (e.hasMoreElements ( )) {
            // moving cursor to next element
            int i = (Integer) e.nextElement ( );
            System.out.println ( i + " " );
        }


    }
}
