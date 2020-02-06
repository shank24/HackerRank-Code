package learning.Map;

import java.util.HashMap;
import java.util.Set;

public
class HashMapDemo {
    public static
    void main (String[] args) {
        HashMap <String, Integer> hashMap = new HashMap ( );
        hashMap.put ( "Fop" , 12 );
        hashMap.put ( "Top" , 22 );
        hashMap.put ( "Yop" , 32 );
        hashMap.put ( "Uop" , 42 );

        System.out.println ( hashMap );

        Set set =  hashMap.entrySet ( );
        System.out.println ( set);

    }
}
