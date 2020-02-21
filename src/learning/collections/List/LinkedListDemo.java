package learning.collections.List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public
class LinkedListDemo {
    public static
    void main (String[] args) {
        Object objects[] =new Object[1000000];

        // Instantiating the values
        for (int i = 0; i <objects.length ; i++) {
            objects[i]=new Object ();
        }

        List<Object> list = new ArrayList <> (  );

        long start = System.currentTimeMillis ();
        for (Object obj:objects) {
            list.add ( obj );

        }
        long end = System.currentTimeMillis ();
        System.out.println ("Time Taken " + (end-start) );
    }
}
