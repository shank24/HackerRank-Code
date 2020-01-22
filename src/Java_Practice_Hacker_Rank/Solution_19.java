package Java_Practice_Hacker_Rank;

import java.util.Scanner;
import java.util.StringTokenizer;

public
class Solution_19 {

    public static
    void main (String[] args) {
        Scanner scan = new Scanner ( System.in );
        String  str  = scan.nextLine ( );

        String str1 = "";

        StringTokenizer st = new StringTokenizer ( str , "[ !,?.\\_'@]+" );


        int count = st.countTokens ( );
        System.out.println ( count );
        while (st.hasMoreElements ( )) {
            str1 = st.nextToken ( );
            System.out.println ( str1 );
        }

        scan.close ( );
    }
}
