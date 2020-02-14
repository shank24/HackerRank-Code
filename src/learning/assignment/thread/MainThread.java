package learning.assignment.thread;

public
class MainThread {
    public static
    void main (String[] args) {
        EvenThread et = new EvenThread ( );

        Thread     t1 = new Thread ( et );
        System.out.println ("Even Numbers" );
        t1.start ( );

        System.out.println ("Odd Numbers" );
        OddThread ot = new OddThread ( );

        Thread t2 = new Thread ( ot );
        t2.start ( );
    }
}
