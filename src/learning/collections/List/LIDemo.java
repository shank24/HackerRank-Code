package learning.collections.List;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public
class LIDemo {
    public static
    void main (String[] args) {

        List<String> list =new LinkedList <> (  );
        list.add ( "ABC" );
        list.add ( "DEF" );
        list.add ( "XYZ" );

        ListIterator <String> itr = list.listIterator ( );
        while(itr.hasNext ()){
            System.out.println (itr.next () );
        }

        System.out.println ("In Backward Direction" );

        while(itr.hasPrevious ()){
            System.out.println (itr.previous () );
        }

    }
}
