package learning.multithreading.synchronization.syncBlocks;

public
class DisplayMessage {

    public
    void
    sayHello (String name) throws InterruptedException {

        // Any code can go before sync block
        // Lock on the object that invokes this Object.
        synchronized (this) {


            for (int i = 0; i < 10; i++) {

                Thread.sleep ( 2000 );
                System.out.println ( "How are you " + name );
            }
        }
    }
}
