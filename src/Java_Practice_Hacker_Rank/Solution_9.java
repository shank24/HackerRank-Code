/*

Problem Statement :-

Input Format

Read some unknown lines of input from stdin(System.in)
until you reach EOF;
each line of input contains a non-empty String.

Output Format

For each line, print the line number,
followed by a single space,
and then the line content received as input.

 */

package Java_Practice_Hacker_Rank;

import java.util.Scanner;

public
class Solution_9 {


    public static
    void main (String[] args) {

        Scanner scan = new Scanner ( System.in );


        int count = 0;

        while (scan.hasNext ( ) == true) {
            count++;
            String line = scan.nextLine ( );
            System.out.println ( count + " " + line );

        }


    }
}
