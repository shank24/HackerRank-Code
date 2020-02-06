package learning.basic.NonStatic;

public
class NonStaticReferenceDemo {

    /*
    Sequence - Static Block -> Main Method -> Non Static Block/Init Block
    ->  Constructor -> Non Static Method
     */
    static {
        System.out.println ( "Inside the Static block" );
    }

    int num;

    // Non Static Block
    {
        System.out.println ( "Inside the Non Static Block" );
    }

    // Constructor
    NonStaticReferenceDemo ( ) {
        System.out.println ( "Inside the Constructor" );
    }

    public static
    void main (String[] args) {
        System.out.println ( "Inside the main Method" );
        NonStaticReferenceDemo obj = new NonStaticReferenceDemo ( );
        obj.doSomething ();
    }

    void doSomething ( ) {
        System.out.println ( "do something" );
    }
}
