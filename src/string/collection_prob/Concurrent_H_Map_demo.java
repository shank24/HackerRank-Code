package string.collection_prob;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public
class Concurrent_H_Map_demo {

    public static
    void main (String[] args) {

        Map<String,Integer> scores = new HashMap <> ( );

        scores.put ( "User1",5 );
        scores.put ( "User2",5 );
        scores.put ( "User3",5 );
        scores.put ( "User4",5 );
        scores.put ( "User5",5 );

        Iterator <String> iterator = scores.keySet ( ).iterator ( );

        while(iterator.hasNext ()){
            System.out.println (scores.get ( iterator.next () ) );
            scores.put ( "User6",5 );
        }

    }
}
