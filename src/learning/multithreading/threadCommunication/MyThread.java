package learning.multithreading.threadCommunication;

public
class MyThread extends Thread {

    int sum = 0;

    @Override
    public
    void run ( ) {
        System.out.println ( "Child Thread is calculating the Sum: " );

        synchronized (this) {
            for (int i = 0; i < 100; i++) {
                sum = sum + i;

            }
            // This Thread will notify to main thread,
            // that lock has been released and Main thread can start afterwards.
            this.notify ( );
        }

    }
}
