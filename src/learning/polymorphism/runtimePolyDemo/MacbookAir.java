package learning.polymorphism.runtimePolyDemo;

public
class MacbookAir extends Macbook {
    @Override
    public void start ( ) {
        System.out.println ("Inside MacbookAir start" );
    }

    @Override
    public void shutdown ( ) {
        System.out.println ("Inside MacbookAir shutdown" );
    }
}
