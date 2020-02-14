package learning.string;

public
class StringDemo {
    public static
    void main (String[] args) {

        //String literal assigned to a String Object reference
        String s1 = "Java";

        //String constructor is overloaded with various values.
        String s2 = new String ( "seven" );


        char ch[] = {'a' , 'i' , 'e' , 'o' , 'u'};

        // This constructor takes char array and
        // converts it into String
        String s3 = new String ( ch );

        byte b[] = {65 , 66 , 67 , 68 , 69};
        // This constructor takes byte array and
        // converts it into String
        String s4 = new String ( b );

        System.out.print ( s1 + "\n" +
                           s2 + "\n" +
                           s3 + "\n" +
                           s4 + "\n" );

    }
}
