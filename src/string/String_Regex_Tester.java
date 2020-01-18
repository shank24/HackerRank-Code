package string;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public
class String_Regex_Tester {

    public static
    void main (String[] args) {

        Scanner in = new Scanner ( System.in );

        int testCases = Integer.parseInt ( in.nextLine ( ) );


        for (int i = 0; i < testCases; i++) {
            String pattern = in.nextLine ( );

            try {
                Pattern.compile ( pattern );
                System.out.println ( "Valid" );
            }
            catch (PatternSyntaxException exception) {
                System.out.println ( "Invalid" );
            }
        }

    }
}
