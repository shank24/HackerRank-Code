package learning.access_Modifier.p2;

import learning.access_Modifier.p1.A;

public
class C extends A{
    public static
    void main (String[] args) {

        A obj = new A ();
        // Only public accessible
        System.out.println (obj.d );

        // Only protected can ne accessed via inheritance.
        // Protected field can be inherited and accessed.
        C obk = new C ();
        System.out.println (obk.c );
        System.out.println (obk.d );
    }


}
