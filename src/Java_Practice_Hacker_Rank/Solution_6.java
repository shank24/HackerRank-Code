/*
Input Format

A single integer, .

Constraints

Output Format

Print  lines of output;
each line  (where) contains the  of  in the form:
N x i = result.
 */

package Java_Practice_Hacker_Rank;

import java.util.Scanner;

public
class Solution_6 {

    public static void main(String[] args) {



        Scanner input = new Scanner ( System.in);
        int n = input.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d\n", n, i, n*i);
        }

        input.close();
    }

}
