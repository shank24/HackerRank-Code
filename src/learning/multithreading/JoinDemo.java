package learning.multithreading;

import java.util.Scanner;

public
class JoinDemo extends Thread{

    static int n,sum=0;

    public static
    void main (String[] args) throws InterruptedException {

        long start = System.currentTimeMillis ();
        System.out.println ("Sum of first n numbers" );
        System.out.println ("Enter a number" );
        Scanner scc = new Scanner ( System.in );
        JoinDemo.n = scc.nextInt ( );

        JoinDemo obj = new JoinDemo ();
        obj.start ();

        // It waits for the main Thread to die, then only it will join
        // the next Thread.
        obj.join ();

        System.out.println ("Sum of first n numbers" +JoinDemo.n + " Sum is "+ JoinDemo.sum );

        long end = System.currentTimeMillis ();
        System.out.println ("Total Time Taken " + (end-start)/1000+"s");

    }

    public void run(){
        for (int i = 0; i <JoinDemo.n ; i++) {
            JoinDemo.sum=i+JoinDemo.sum;
            try {
                Thread.sleep ( 100 );
            }
            catch (InterruptedException e) {
                e.printStackTrace ( );
            }
        }
    }
}
