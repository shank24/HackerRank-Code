package learning.polymorphism.runtimePolyDemo;

public
class MacbookPro extends Macbook {
    @Override
    public void start ( ) {
        System.out.println ("Inside MacbookPro start" );
    }

    @Override
    public void shutdown ( ) {
        System.out.println ("Inside MacbookPro shutdown" );
    }

    void prosMethod(){
        System.out.println ("Specfic to Pro" );
    }
}
