/*
You are given an integer , you have to convert it into a string.

Please complete the partially completed code in the editor. If your code successfully converts  into a string  the code will print "Good job". Otherwise it will print "Wrong answer".

 can range between  to  inclusive.
 */

package Java_Practice_Hacker_Rank;

import java.util.Scanner;

public
class Solution_11 {

    public static
    void main (String[] args) {

        try {
            Scanner in = new Scanner ( System.in );
            int     n  = in.nextInt ( );
            in.close ( );

            if(n>=-100 && n<=100){
                String s=Integer.toString ( n );
                System.out.println ("Good Job" );
            }
            else{
                System.out.println ("Wrong answer" );
            }
        }

        catch (Exception i){
            i.printStackTrace ();
        }
    }
}
