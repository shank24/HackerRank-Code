/*
Problem Statement :-
There are three lines of output:

On the first line, print String: followed by the unaltered String read from stdin.
On the second line, print Double: followed by the unaltered double read from stdin.
On the third line, print Int: followed by the unaltered integer read from stdin.

 */

package Java_Practice_Hacker_Rank;

import java.util.Scanner;

public
class Solution_4 {

    public static void main(String[] args) {
        Scanner sc=new Scanner ( System.in);

        int x=sc.nextInt();
        Double y=sc.nextDouble();
        //sc.nextLine();
        String s=sc.nextLine();

        System.out.println("String: "+s);
        System.out.println("Double: "+y);
        System.out.println("Int: "+x);
    }
}
