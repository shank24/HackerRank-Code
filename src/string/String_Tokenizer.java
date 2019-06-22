package string;

import java.util.Scanner;
import java.util.StringTokenizer;

public
class String_Tokenizer {

    public static
    void main (String[] args) {

        Scanner scanner = new Scanner ( System.in );

        String str = scanner.nextLine ( );

        String str1 = "";

        StringTokenizer st = new StringTokenizer ( str,"[ !,?.\\_'@]+" );

        int count = st.countTokens ( );
        System.out.println ( count );
        while (st.hasMoreElements ( )) {
            str1 = st.nextToken ( );
            System.out.println ( str1 );
        }


        scanner.close ( );
    }
}
