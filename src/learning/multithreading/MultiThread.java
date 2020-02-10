package learning.multithreading;

public
class MultiThread extends Thread {
    public static
    void main (String[] args) throws InterruptedException {

        MultiThread threadObj = new MultiThread ( );
        threadObj.setPriority (MAX_PRIORITY);
        threadObj.setName ( "MT1" );
        threadObj.start ( );


        MultiThread threadObj1 = new MultiThread ( );
        threadObj1.setPriority (MIN_PRIORITY);
        threadObj1.setName ( "MT2" );
        threadObj1.start ( );


        /*for (int j = 1; j <= 200; j++) {
            System.out.print ( "j:" + j + "\t" );
            Thread.sleep ( 1000 );
        }*/
    }

    public
    void run ( ) {


        System.out.println ("Thread Name: "+ Thread.currentThread ().getName () );
        /*for (int i = 1; i <= 200; i++) {
            System.out.print ( "i:" + i + "\t" );
            try {
                Thread.sleep (  1000);
            }
            catch (InterruptedException e) {
                e.printStackTrace ( );
                e.getMessage ();

            }
        }*/
    }
}
