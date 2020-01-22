/*
Problem Statement:-
Input Format

There are two lines of input.
The first line contains : the breadth of the parallelogram.
The next line contains : the height of the parallelogram.

Constraints

Output Format

If both values are greater than zero,
then the main method must output the area of the parallelogram.
Otherwise, print "java.lang.Exception: Breadth and height must be positive" without quotes.
*/
package Java_Practice_Hacker_Rank;

import java.util.Scanner;

public
class Solution_10 {

    static Scanner input = new Scanner ( System.in );
    static boolean flag  = true;
    static int     B     = input.nextInt ( );
    static int     H     = input.nextInt ( );


    static {
        try {
            if ( B <= 0 || H <= 0 ) {
                flag = false;
                throw new Exception ( "Breadth and height must be positive" );
            }
        }
        catch (Exception e) {
            System.out.println ( e );
        }
    }

    public static
    void main (String[] args) {

        if(flag==true)
        System.out.println ( "Area of Parallelogram " + B * H );

    }
}
