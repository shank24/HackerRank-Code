/*
https://www.hackerrank.com/challenges/java-string-reverse/problem
 */
package Java_Practice_Hacker_Rank;

import java.util.Scanner;

public
class Solution_17 {

    public static
    void main (String[] args) {

        Scanner sc = new Scanner ( System.in );
        String  A  = sc.next ( );

        /* Enter your code here. Print output to STDOUT. */
        String reverse = new StringBuilder ( A ).reverse ( ).toString ( );

        System.out.println ( (A.compareTo ( reverse ) == 0) ? "Yes" : "No" );

    }
}
