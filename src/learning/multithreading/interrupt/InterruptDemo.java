package learning.multithreading.interrupt;

public
class InterruptDemo {
    public static
    void main (String[] args) {
        MyThread t = new MyThread ();
        t.start ();
        t.interrupt ();
        System.out.println ("End of a Main Method" );
    }
}
