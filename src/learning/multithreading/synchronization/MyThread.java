package learning.multithreading.synchronization;

public
class MyThread extends Thread {

    String         name;

    MyThread (String name) {
        this.name = name;
    }

    public
    void run ( ) {
        try {
            DisplayMessage.sayHello ( name );
        }
        catch (InterruptedException e) {
            e.printStackTrace ( );
        }
    }
}
