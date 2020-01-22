/*
Problem Statement

Given an integer, , perform the following conditional actions:

If  is odd, print Weird
If  is even and in the inclusive range of  to , print Not Weird
If  is even and in the inclusive range of  to , print Weird
If  is even and greater than , print Not Weird
Complete the stub code provided in your editor to print whether or not  is weird.
 */

package Java_Practice_Hacker_Rank;

import java.util.Scanner;

public
class Solution_3 {


    public static
    void main (String[] args) {

        Scanner sc  = new Scanner ( System.in );
        int     n   = sc.nextInt ( );
        String  ans = "";

        if ( n >= 1 && n % 2 == 1 && n <= 100 ) {
            ans = "Weird";
        } else if ( n >= 1 && n >= 2 && n <= 5 && n <= 100 ) {
            ans = "Not Weird";
        } else if ( n >= 1 && n % 2 == 0 && n >= 6 && n <= 20 && n <= 100 ) {
            ans = "Weird";
        } else if ( n >= 1 && n % 2 == 0 && n > 20 && n <= 100 ) {
            ans = "Not Weird";
        }

        System.out.println ( ans );

    }

}
