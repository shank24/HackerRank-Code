package string;

import java.util.Scanner;

public
class String_Palindrome_Ternary {

    public static
    void main (String[] args) {
        Scanner s = new Scanner ( System.in );

        System.out.println ( "Enter The String : " );

        String str = s.nextLine ( );

        String rev = new StringBuilder ( str ).reverse ( ).toString ( );

        System.out.println ( (str.compareTo ( rev ) == 0) ? "Yes" : "No" );


    }


}
