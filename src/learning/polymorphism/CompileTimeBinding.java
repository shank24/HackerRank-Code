package learning.polymorphism;

public
class CompileTimeBinding {
    public static
    void main (String[] args) {

        CompileTimeBinding obj = new CompileTimeBinding ();
        obj.add ( 10,20 );
        obj.add ( 1f,2f );
        obj.add ( 20,30,40 );

    }

    void add(int a, int b){
        int result = a+b;
        System.out.println ("Result is "+ result );
    }


    void add(float a, float b){
        float result = a+b;
        System.out.println ("Result is "+ result );
    }

    void add (int a, int b, int c){
        int result = a+b+c;
        System.out.println ("Result is "+ result );
    }

    //At compile time, the compier links the
    // method depending upon the type of parameters we are passing.
}
