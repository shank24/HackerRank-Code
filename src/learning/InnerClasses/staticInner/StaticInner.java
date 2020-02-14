package learning.InnerClasses.staticInner;

public
class StaticInner {

    static void f1(){
        System.out.println ("Outers Static Method" );
    }
    static class Inner{
        static void f2(){
            System.out.println ("Inners static method" );
        }
    }
    public static
    void main (String[] args) {
            StaticInner.f1 ( );
            StaticInner.Inner.f2 ( );

    }
}
