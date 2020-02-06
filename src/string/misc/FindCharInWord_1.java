package string.misc;

import java.util.Scanner;

public
class FindCharInWord_1 {

    public static
    void main (String[] args) {

        Scanner sc = new Scanner ( System.in );
        System.out.println ( "Enter a String " );
        String str = sc.nextLine ( );


        getCountOfChar ( str );
    }

    private static
    void getCountOfChar (String str) {

        int  length = str.length ( );
        int  count  = 0;
        char ch, cs;

        System.out.println ( "Char\tFreq" );
        System.out.println ( "=============" );

        for (cs = 'a'; cs <= 'z'; cs++) {
            count = 0;
            for (int i = 0; i < length; i++) {
                ch = str.charAt ( i );
                if ( ch == cs ) {
                    count++;
                }
            }

            if ( count != 0 ) {
                System.out.println ( cs + "\t\t" + count );
            }
        }


    }
}
