package learning.string.bufferandbuilder;

public
class SBDemo {
    public static
    void main (String[] args) {
        StringBuffer sb =new StringBuffer (  );
        System.out.println ("Initial Capacity " + sb.capacity () );

        sb.append ( "All the power is with in you " );
        sb.append ( "Go and Win the war" );
        System.out.println (sb );
        System.out.println (sb.capacity () );
        System.out.println (sb.charAt ( 5 ) );

        StringBuffer sb1 = new StringBuffer ( "Java" );
        System.out.println (sb1.reverse () );
        System.out.println (sb1.insert ( 3,"xyz" ) );
        System.out.println (sb1 );
        System.out.println (sb1.delete ( 2,4 ));

    }
}
