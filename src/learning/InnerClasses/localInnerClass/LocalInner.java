package learning.InnerClasses.localInnerClass;

public
class LocalInner {

    void f1(){
        System.out.println ("Inside Outer's f1" );
        // Local to this method
        class LocalClass{
            void f2(){
                System.out.println ("Inside Local Inner's f2" );
            }
        }

        LocalClass localClass = new LocalClass ( );
        localClass.f2 ();
    }

    public static
    void main (String[] args) {
        LocalInner localInner =new LocalInner ();
        localInner.f1 ();
    }

}
