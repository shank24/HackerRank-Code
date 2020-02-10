package learning.Inheritance;

public
class SingleInheritance {
    public static
    void main (String[] args) {

        SingleInheritance ob = new SingleInheritance ( );

        ob.m1 ();
        System.out.println ( ob.hashCode ( ) );
       // System.out.println ( ob.finalize ( ) );
        System.out.println ( ob.getClass ( ) );
    }

    void m1 ( ) {
        System.out.println ( "Inside M1" );
    }
}
