package learning.multithreading.threadCommunication;

public
class MainThread {
    public static
    void main (String[] args) throws InterruptedException {
        MyThread t = new MyThread ( );
        t.start ( );

        synchronized (t) {
            System.out.println ("Main thread is going to wait" );
            // This thread is going to wait,
            // until the Child thread is going to finish.
            t.wait ( );
            System.out.println ( "Main Thread  Notified" );
            System.out.println ( t.sum );
        }
    }

}
