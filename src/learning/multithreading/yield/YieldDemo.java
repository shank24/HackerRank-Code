package learning.multithreading.yield;

public
class YieldDemo {
    public static
    void main (String[] args) {
        MyThread mt = new MyThread ();
        mt.start ();

        for (int i = 0; i <10 ; i++) {
            System.out.println ("Main Thread" );

        }
    }
}
