package learning.InnerClasses.staticInner;

public
class NonStaticInner {

    static
    void f1 ( ) {
        System.out.println ( "Outers Static Method" );
    }

    public static
    void main (String[] args) {

        NonStaticInner.f1 ( );
        NonStaticInner.Inner.f2 ( );

        NonStaticInner.Inner inner = new NonStaticInner.Inner ();
        inner.f3 ();

    }

    static
    class Inner {
        static
        void f2 ( ) {
            System.out.println ( "Inners static method" );
        }

        void f3(){
            System.out.println ("Non Static Method" );
        }
    }
}
