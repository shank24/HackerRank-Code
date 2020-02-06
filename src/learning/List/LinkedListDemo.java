package learning.List;

import java.util.LinkedList;

public
class LinkedListDemo {

    public static
    void main (String[] args) {
        LinkedList list = new LinkedList (  );

        list.add ( 1 );
        list.add ( 'c' );
        list.addFirst ( 2121 );
        Object clone = list.clone ( );
        System.out.println (list.toString () );
        System.out.println (clone );
    }
}
