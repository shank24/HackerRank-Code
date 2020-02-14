package learning.objectMethods;

public
class TestC {
    public static
    void main (String[] args) {
        Passenger p = new Passenger ();
        p.setFirstName ( "Abhi" );
        p.setLastName ( "Kalra" );
        p.setId ( 123 );

        Passenger p1 = new Passenger ();
        p1.setFirstName ( "Abhi" );
        p1.setLastName ( "Kalra" );
        p1.setId ( 123 );


        System.out.println (p.equals ( p1 ) );

        System.out.println (p );

        System.out.println (p.hashCode () );

    }
}
