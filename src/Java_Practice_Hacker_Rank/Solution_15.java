/*

Given a string, s, and two indices,  start and end,
print a substring consisting of
all characters in the inclusive range from to .
You'll find the String class' substring method
helpful in completing this challenge.


The first line contains a single string denoting s.
The second line contains two space-separated
integers denoting the respective values of  start and end.


String  consists of English alphabetic letters (i.e., ) only.

Print the substring in the inclusive range from  start to end-1.
 */

package Java_Practice_Hacker_Rank;

import java.util.Scanner;

public
class Solution_15 {

    public static
    void main (String[] args) {
        Scanner in    = new Scanner ( System.in );
        String  S     = in.next ( );
        int     start = in.nextInt ( );
        int     end   = in.nextInt ( );

        System.out.println ( S.substring ( start , end ) );
    }
}
