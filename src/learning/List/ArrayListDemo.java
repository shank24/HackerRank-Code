package learning.List;

import java.util.ArrayList;
import java.util.Iterator;

public
class ArrayListDemo {
    public static
    void main (String[] args) {
        ArrayList<Integer> arrayList = new ArrayList();

        for (int i = 1; i <10 ; i++) {
            arrayList.add (i);
        }


        arrayList.remove (0);
        arrayList.add ( 8 );
        Iterator ltr = arrayList.iterator ();

        while(ltr.hasNext ()){
            System.out.println ( ltr.next ());
        }
    }
}
