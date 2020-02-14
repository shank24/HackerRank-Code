package learning.multithreading.interrupt;

public
class MyThread extends Thread{

    @Override
    public
    void run ( ) {
        for (int i = 0; i <10 ; i++) {
            System.out.println ("I am a good Thread" );
            try {
                Thread.sleep ( 2000 );
            }
            catch (InterruptedException e) {
                System.out.println ("Got Interrupted" );
            }
        }
    }
}
