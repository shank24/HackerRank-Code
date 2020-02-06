package learning.assignment;

import java.util.Scanner;

public
class Number {
    public static
    void main (String[] args) {

        Scanner sc = new Scanner ( System.in );
        System.out.println ("Enter the Number" );
        int num = sc.nextInt ();

        for (int i = 1; i <=num ; i++) {

            if(i%10==0){
                continue;
            }
            if(num>100){
                break;
            }
            System.out.println (i);
        }

    }

}
