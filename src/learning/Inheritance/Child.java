package learning.Inheritance;

public
class Child extends Parent{

    // Parent & Child share the same memory location
    Child(){
        System.out.println ("Child Object   "+this );
    }
    void f2(){
        System.out.println ("Inside f2" );
    }
}
