package learning.executor;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public
class ExecutorDemo {
    public static
    void main (String[] args) {

        CheckProcessorTask[] cps = {new CheckProcessorTask ( "ATM" ) ,
                new CheckProcessorTask ( "Bank" ) ,
                new CheckProcessorTask ( "Web" ) ,
                new CheckProcessorTask ( "Mobile" )};

        ExecutorService service = Executors.newFixedThreadPool ( 1 );

        for (CheckProcessorTask checkProcessorTask:cps){
            service.submit ( checkProcessorTask );
        }

        service.shutdown ();
    }
}
