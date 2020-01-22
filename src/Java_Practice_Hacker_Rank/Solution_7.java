/*

Input Format

The first line contains an integer, , denoting the number of queries.
Each line  of the  subsequent lines contains three space-separated integers describing the respective,
and values for that query.

Constraints

Output Format

For each query,
print the corresponding series on a new line. Each series must be printed in order as a single line of  space-separated integers.

 */
package Java_Practice_Hacker_Rank;

import java.util.Scanner;

public
class Solution_7 {

    public static
    void main (String[] args) {


        Scanner sc    = new Scanner ( System.in );
        System.out.println ("Enter the number of iterations " );
        int     lines = sc.nextInt ( );
        int     a[]   = new int[lines];
        int     b[]   = new int[lines];
        int     n[]   = new int[lines];

        for (int i = 0; i < lines; i++) {
            System.out.println ("Enter the value of a" );
            a[i] = sc.nextInt ( );
            System.out.println ("Enter the value of b" );
            b[i] = sc.nextInt ( );
            System.out.println ("Enter the value of n" );
            n[i] = sc.nextInt ( );
        }

        //outer loop - lines
        for (int i = 0; i < lines; i++) {
            //second loop - n
            for (int j = 0; j < n[i]; j++) {
                //interior loop
                int sum = a[i];
                for (int k = 0; k <= j; k++) {
                    sum += Math.pow ( 2 , k ) * b[i];
                }
                System.out.print ( sum + " " );
            }
            System.out.println ( "" );
        }

    }

}