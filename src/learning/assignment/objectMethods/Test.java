package learning.assignment.objectMethods;

public
class Test {
    public static
    void main (String[] args) {
        ElectricityBill e1 = new ElectricityBill ();
        e1.setMeterNo ( 122 );
        e1.setName ( "MOMO" );
        e1.setAddress ( "NOIDA" );

        ElectricityBill e2 = new ElectricityBill ();
        e2.setMeterNo ( 122 );
        e2.setName ( "MOMO" );
        e2.setAddress ( "NOIDA" );

        System.out.println (e1.equals ( e2 ) );
        System.out.println (e1 );
        System.out.println (e2 );
        System.out.println (e1.hashCode ()  );
        System.out.println (e2.hashCode () );
    }
}
