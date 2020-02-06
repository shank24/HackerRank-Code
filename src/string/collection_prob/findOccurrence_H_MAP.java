package string.collection_prob;

import java.util.HashMap;
import java.util.Scanner;

public
class findOccurrence_H_MAP {


    public static
    void main (String[] args) {
        Scanner sc  = new Scanner ( System.in );
        String  str = sc.nextLine ( );

        characterCount ( str );

    }

    private static
    void characterCount (String str) {

        //Creating a HashMap
        HashMap <Character, Integer> charCountMap = new HashMap <> ( );


        // Converting given String to Char Array
        char ch[] = str.toCharArray ( );

        // checking each char of strArray
        for (char c : ch) {
            if ( charCountMap.containsKey ( c ) ) {
                charCountMap.put ( c , charCountMap.get ( c ) + 1 );
            } else {
                charCountMap.put( c,1 );
            }

        }


    }


}
