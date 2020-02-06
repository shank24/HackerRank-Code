package string.misc;

import java.util.Scanner;

public
class FindWordLength {

    public static
    void main (String[] args) {

        Scanner sc  = new Scanner ( System.in );
        String  str = sc.nextLine ();
        countWordWithLength ( str );

    }

    private static
    void countWordWithLength (String str) {

        char ch[] = str.toCharArray ( );

        for (int i = 0; i <= ch.length; i++) {

            String str1 = "";

            // When the character is not a space and length<ch.length
            while (i < ch.length && ch[i] != ' ') {
                str1 = str1 + ch[i];
                i++;
            }
            if ( str.length ( ) > 0 ) {
                System.out.println ( str1 + " is " + str1.length ( ) );
            }

        }
    }
}
