/*
Link - https://www.hackerrank.com/challenges/java-string-compare/problem
 */
package Java_Practice_Hacker_Rank;

import java.util.Scanner;

public
class Solution_16 {

    public static
    void main (String[] args) {

        Scanner sc = new Scanner ( System.in );

        System.out.println ("Enter the String " );
        String str = sc.next ();
        System.out.println ("Enter the value");
        int val = sc.nextInt ();

        String result = getSmallestAndLargest ( str,val );
        System.out.println (result );
    }

    public static String getSmallestAndLargest(String s, int k) {
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        String first = null, second = null;

        for (int i = 0; i < s.length() - k + 1; i++) {
            String temp = s.substring(i, i + k);

            if ( first == null ) {
                first = temp;
                second = temp;
            } else {
                if ( temp.compareTo(first) < 0 ) {
                    first = temp;
                } else if ( temp.compareTo(second) > 0 ) {
                    second = temp;
                }
            }
        }


        return first + "\n" + second;
    }
}
