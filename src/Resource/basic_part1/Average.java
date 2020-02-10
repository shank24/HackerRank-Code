package Resource.basic_part1;

import java.util.Scanner;

public
class Average {
    public static
    void main (String[] args) {


        Scanner sc = new Scanner ( System.in );
        System.out.println ("Enter The First Number" );
        int num1 = sc.nextInt ();

        System.out.println ("Enter The Second Number" );
        int num2 = sc.nextInt ();

        System.out.println ("Enter The Third Number" );
        int num3 = sc.nextInt ();

        int average = (num1+num2+num3)/3;
        System.out.println (average );




    }
}
