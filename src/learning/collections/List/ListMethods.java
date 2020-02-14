package learning.collections.List;

import java.util.ArrayList;
import java.util.List;

public
class ListMethods {
    public static
    void main (String[] args) {
        List<Integer> list = new ArrayList<> (  );

        for (int i = 10; i <=100 ; i=i+10) {
            list.add ( i );
        }
        System.out.println (list );
        list.add ( 3,444 );
        System.out.println (list );

        list.set ( 3 ,2000);
        System.out.println (list);

        List<Integer> list1=new ArrayList <> ( );
        list1.add (111 );
        list1.add (222 );
        list1.add (333 );

        list.addAll ( 0,list1 );
        System.out.println (list );

        if(list.contains ( 222 )){
            System.out.println ("List has a value" );
        }else{
            System.out.println ("List does not have a value" );
        }


    }
}
