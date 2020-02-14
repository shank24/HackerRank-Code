package learning.Inheritance;

public
class Child extends Parent {

    // Parent & Child share the same memory location
    Child ( ) {
        //super();
        System.out.println ( "Child Object   " + this );
    }

    void f2 ( ) {
        super.f1 ();
        System.out.println ( "Inside f2" );
    }
}
