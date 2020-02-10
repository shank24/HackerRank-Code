package learning.abstraction;

public
abstract
class BMW {

    void commonFun ( ) {
        System.out.println ( "Common functionality" );
    }

    abstract
    void accelerate ( );

    public static
    void main (String[] args) {
        System.out.println ("Inside the main method" );
    }
}
