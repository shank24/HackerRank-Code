package string.collection_prob;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public
class Weak_H_Map {

    public static
    void main (String[] args) {

        Map <Order, Integer> order = new WeakHashMap <> ( );

        order.put ( new Order ( 1 , "fdfdfff" ) , 5556 );
        order.put ( new Order ( 2 , "fddfdfd" ) , 5557 );

        Order or = new Order ( 3 , "dsdsds" );
        order.put ( or , 343434 );

        System.out.println ( order.size ( ) );
        System.gc ( );
        System.out.println ( order.size ( ) );

    }
}


class Order {
    int    id;
    String details;

    public
    Order (int ID , String theDetails) {
        id = ID;
        details = theDetails;
    }
}