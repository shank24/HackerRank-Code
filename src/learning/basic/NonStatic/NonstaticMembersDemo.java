package learning.basic.NonStatic;

public
class NonstaticMembersDemo {

    // Non Static - is specific to each object of its class
    int num;

    {
        System.out.println ( "In Non Static Block" );
    }

    NonstaticMembersDemo ( ) {

        System.out.println ( "Inside the Constructor" );
        System.out.println ( num );

    }

    public static
    void main (String[] args) {

        new NonstaticMembersDemo ();
        System.out.println ("In Main Method" );
        new NonstaticMembersDemo ();
    }

    static {
        System.out.println ("Inside Static Block" );
    }
}
