package learning.multithreading.synchronization;

public
class SynchronizedDemo {
    public static
    void main (String[] args) {
        MyThread t1 = new MyThread ( "Steve" );

        MyThread t2 = new MyThread ( "Smith" );

        t1.start ( );
        t2.start ( );
    }
}
