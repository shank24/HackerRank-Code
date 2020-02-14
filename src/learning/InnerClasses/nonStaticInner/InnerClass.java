package learning.InnerClasses.nonStaticInner;

public
class InnerClass {

    void f1(){
        System.out.println ("Outer Classes Non Static Method" );
    }
    public static
    void main (String[] args) {

        InnerClass ob = new InnerClass ();
        ob.f1 ();

        InnerClass.Inner inner = ob.new Inner();
        inner.f2 ();
    }

    class Inner {
        void f2 ( ) {
            System.out.println ( "Inner Classes Non Static Method" );
        }
    }
}
