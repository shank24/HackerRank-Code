package learning.multithreading.synchronization.syncBlocks;

public
class MyThread extends Thread {

    String         name;
    DisplayMessage dm;

    MyThread (DisplayMessage dm,String name) {
        this.dm=dm;
        this.name = name;
    }

    public
    void run ( ) {
        try {
            dm.sayHello ( name );
        }
        catch (InterruptedException e) {
            e.printStackTrace ( );
        }
    }
}
