package Resource.basic_part1;

import java.util.Scanner;

public
class Swap {

    public static
    void main (String[] args) {

        Scanner sc = new Scanner ( System.in );
        System.out.println ("Enter The First Number" );
        int num1 = sc.nextInt ();

        System.out.println ("Enter The Second Number" );
        int num2 = sc.nextInt ();


        System.out.println ("Before" );
        System.out.println (num1 );
        System.out.println (num2 );

        int temp;

        temp=num1+num2;
        num1 = temp-num1;
        num2=temp-num1;

        System.out.println ("After" );
        System.out.println (num1 );
        System.out.println (num2 );
    }
}
