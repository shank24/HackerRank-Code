package learning.executor;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public
class TestCallable {

    public static
    void main (String[] args) throws ExecutionException, InterruptedException {

        MyCallable[] myCallables = {new MyCallable ( 10 ) ,
                new MyCallable ( 20 ) ,
                new MyCallable ( 30 ) ,
                new MyCallable ( 40 ) ,
                new MyCallable ( 50 ) ,
                new MyCallable ( 60 )
        };


        ExecutorService service = Executors.newFixedThreadPool ( 3 );

        for (MyCallable myCallable : myCallables) {
            Future <Integer> future = service.submit ( myCallable );

            System.out.println ( future.get ( ) );
        }

        service.shutdown ( );
    }

}
