package learning.collections.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public
class HashMapDemo {

    public static
    void main (String[] args) {
        Map <String, Integer> map = new HashMap <> ( );
        map.put ( "John" , 70 );
        map.put ( "Tom" , 60 );
        map.put ( "Sean" , 10 );
        map.put ( "Kylie" , 710 );

        //Get the Keys alone
        Set <String> strings = map.keySet ( );
        System.out.println ( "Keys " + strings );

        Collection <Integer> values = map.values ( );
        System.out.println ( "Values" + values );


        for (String key : strings) {
            System.out.println ( " Keys " + key + " Values " + map.get ( key ) );


        }


    }
}
