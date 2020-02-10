package learning.polymorphism.runtimePolyDemo;

public
class Macbook implements AppleLaptop {

    public void start ( ) {
        System.out.println ( "Inside Macbook start" );
    }

    public void shutdown ( ) {
        System.out.println ( "Inside Macbook shutdown" );
    }
}
