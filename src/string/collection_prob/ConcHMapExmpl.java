package string.collection_prob;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

public
class ConcHMapExmpl {

    static
    Map<String, AtomicLong> orders = new ConcurrentHashMap <> (  );

    static void processOrders(){
        for(String city: orders.keySet ()){
            for(int i=0;i<50;i++){
                orders.get ( city ).getAndIncrement ();
            }
        }
    }
    public static
    void main (String[] args) throws InterruptedException {

        orders.put ( "Bombay",new AtomicLong (  ) );
        orders.put ( "Beijing",new AtomicLong (  ));
        orders.put ( "Toronto",new AtomicLong (  ));
        orders.put ( "Winnipeg",new AtomicLong (  ));

        ExecutorService service = Executors.newFixedThreadPool ( 2 );

        service.submit ( ConcHMapExmpl::processOrders );
        service.submit ( ConcHMapExmpl::processOrders );

        service.awaitTermination ( 1, TimeUnit.SECONDS );
        service.shutdown ();

        System.out.println (orders );

    }


}
