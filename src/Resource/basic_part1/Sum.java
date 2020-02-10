package Resource.basic_part1;

import java.util.Scanner;

public
class Sum {
    public static
    void main (String[] args) {

        Scanner sc = new Scanner ( System.in );
        System.out.println ("Enter The First Number" );
        int num1 = sc.nextInt ();

        System.out.println ("Enter The Second Number" );
        int num2 = sc.nextInt ();

        int sum=0;

        if(num1 >0 && num2 >0){
            sum=num1+num2;
        }

        System.out.println ("The sum is " + sum );
    }
}
