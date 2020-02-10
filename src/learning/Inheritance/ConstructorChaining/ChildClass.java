package learning.Inheritance.ConstructorChaining;

public
class ChildClass extends SuperClass {

    int x;


    ChildClass ( ) {
        this ( 10 );
        System.out.println ( "No Arg ChildClass Constructor" );
    }

    ChildClass (int x) {
        super ( x );
        System.out.println ( "One Arg ChildClass Constructor" );
    }

    public static
    void main (String[] args) {
        ChildClass ch = new ChildClass ( );

    }
}
