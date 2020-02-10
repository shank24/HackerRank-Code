package learning.Inheritance.ConstructorChaining;


public
class Child extends Parent {

    int c, d;

    Child (int a , int b , int c , int d) {
        super ( a , b );
        this.c = c;
        this.d = d;
    }

    void display(){
        System.out.println ("Parents -> a " + super.a );
        System.out.println ("Parents -> b " + super.b );
        System.out.println ("Values -> c " + this.c );
        System.out.println ("Values -> d " + this.d );

    }

    void f1 ( ) {
        // It will invoke the Parents f1 method.
        super.f1 ( );

        System.out.println ( "Inside Child f1" );
    }
}
