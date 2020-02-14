package learning.string;

public
class StringMethods {

    public static
    void main (String[] args) {

        String s   = "Hello World";
        int    len = s.length ( );
        System.out.println ( len );
        System.out.println ( s.indexOf ( 'o' ) );
        System.out.println ( s.charAt ( 0 ) );
        System.out.println ( s.matches ( "Hello" ) );
        System.out.println ( s.subSequence ( 0 , 4 ) );
        System.out.println ( s.substring ( 2 ) );
        System.out.println ( s.substring ( 0 , 4 ) );

        String[] result = s.split ( " " );
        for (int i = 0; i < result.length - 1; i++) {
            System.out.println ( result[i] );
        }


        System.out.println ( "Replace : " + s.replace ( 'l' , 'T' ) );

        System.out.println ( s.toUpperCase ( ) );
        System.out.println ( s.toLowerCase ( ) );


    }

}
