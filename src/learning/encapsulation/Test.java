package learning.encapsulation;

public
class Test {
    public static
    void main (String[] args) {
        Customer c = new Customer ();

        c.setFirstName ( "Shank" );
        c.setLastName ( "Carl" );
        c.setCreditCard ( "1234" );

        System.out.println ("First Name "+ c.getFirstName ()  + "\n" +
                            "Last Name " + c.getLastName () + "\n" +
                            "Credit Card " + c.getCreditCard ());

    }
}
