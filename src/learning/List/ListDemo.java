package learning.List;

import java.util.ArrayList;
import java.util.List;

public
class ListDemo {

    public static
    void main (String[] args) {
        List l1 = new ArrayList<> (  );

        l1.add (0,12  );
        l1.add ( 1, 14 );
        l1.add ( 2,14 );
        System.out.println (l1 );
/*
        List l2 = new ArrayList (  );
        l2.add ( 0,111 );
        l2.add ( 1,345 );
        l2.add ( 2,594 );
        l2.add ( 3,546 );



        l2.addAll ( 2,l1 );
        System.out.println (l2 );

        l2.remove ( 2 );

        System.out.println (l2 );

        System.out.println (l2.get ( 0 ) );

        System.out.println (l2.indexOf ( 111 ) );
        System.out.println (l2.lastIndexOf ( 12 ) );

        List l3 = new ArrayList (  );
        l3=l2.subList ( 0,4 );
        System.out.println (l3 );*/
    }

}
