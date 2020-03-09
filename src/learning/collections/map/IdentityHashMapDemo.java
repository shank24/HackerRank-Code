package learning.collections.map;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public
class IdentityHashMapDemo {
    public static
    void main (String[] args) {
        Map <Integer, String> map = new IdentityHashMap <> ( );

        Integer id1 = new Integer ( 10 );
        Integer id2 = new Integer ( 10 );

        map.put ( id1 , "John" );
        map.put ( id2 , "Sarthi" );

        System.out.println ( map );
        // In case of Map
        // It is overriding the existing Values, because we are
        // passing same keys as 10.

        // Identity hashmap does not use equals() to check the content,
        // whereas it used == operator.

        // Hashmap uses equals() to check the content

        // In case of IdentityHashMap , it allows the 2 value, because it use "==" operator.

    }
}
