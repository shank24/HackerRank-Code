package learning.assignment.encap;


public
class Test {
    public static
    void main (String[] args) {

        Patient ob = new Patient ();
        ob.setId ( 101 );
        ob.setName ( "Brownie" );
        ob.setSsn ( "909" );

        System.out.println ( "Name " + ob.getName () + "\n" + "ID " + ob.getId () + "\n" + "SSN " + ob.getSsn ());

        int i=567;
        byte b = (byte)i;
        System.out.println (b );
    }
}
