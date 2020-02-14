package learning.InnerClasses.accessOuterClass;

public
class AccessOuterClass {

    private static int x = 50;
    private        int y;


    AccessOuterClass (int y) {
        this.y = y;
    }


    public static
    void main (String[] args) {

        AccessOuterClass ob = new AccessOuterClass ( 80 );
        ob.f1 ( );

        AccessOuterClass.Inner inner = ob.new Inner ( 30 );
        inner.f2 ( );

        System.out.println (inner.y );
    }

    void f1 ( ) {
        System.out.println ( "Outer Classes Non Static Method" );
    }

    class Inner {

        private int y;

        Inner (int y) {
            this.y = y;

        }

        void f2 ( ) {
            System.out.println ( "Outer Class Static Var " + AccessOuterClass.x );
            System.out.println ( "Outer Class Non Static Var " + AccessOuterClass.this.y );
            System.out.println ( "Inner Class Non Static Var " + this.y );
        }
    }
}
