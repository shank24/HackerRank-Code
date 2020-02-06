package learning.basic.Static;

public
class StaticMethodDemo {
    public static
    void main (String[] args) {

        System.out.println ("Inside Main" );
    }

    static void method1(){
        System.out.println ("Cherry" );
    }

    static{
        System.out.println ("Inside the Static Block" );
        method1 ();
    }
}
