package learning.multithreading.synchronization;

public
class DisplayMessage {

    public
    synchronized
    static void
    sayHello (String name) throws InterruptedException {
        for (int i = 0; i < 10; i++) {

            Thread.sleep ( 2000 );
            System.out.println ( "How are you " + name );
        }
    }
}
