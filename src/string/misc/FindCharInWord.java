package string.misc;

import java.util.Scanner;

public
class FindCharInWord {

    public static
    void main (String[] args) {

        Scanner sc  = new Scanner ( System.in );
        String  str = sc.next ( );

        getCountOfChar ( str );
    }

    private static
    void getCountOfChar (String str) {

        //Creating an array of 256 char.
        int count[] = new int[1 << 8];

        int length = str.length ( );

        // Initialize Count Array Index
        for (int i = 0; i < length; i++) {
            count[str.charAt ( i )]++;
        }

        //Create an array of given String size
        char ch[] = new char[str.length ( )];

        for (int i = 0; i < length; i++) {
            ch[i] = str.charAt ( i );
            int find = 0;
            for (int j = 0; j <= i; j++) {
                if ( str.charAt ( i ) == ch[j] ) {
                    find++;
                }

            }

            if ( find == 1 ) {
                System.out.println ( "Number of Occurrence of " + str.charAt ( i ) +
                                     " is: " + count[str.charAt ( i )] );
            }
        }
    }


}

