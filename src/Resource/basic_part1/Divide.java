package Resource.basic_part1;

import java.util.Scanner;

public
class Divide {
    public static
    void main (String[] args) {

        Scanner sc = new Scanner ( System.in );
        System.out.println ("Enter The First Number" );
        int num1 = sc.nextInt ();

        System.out.println ("Enter The Second Number" );
        int num2 = sc.nextInt ();

        int div=0;

        if(num1/num2==0){
            System.out.println ("Denominator is big" );
        }
        else{
            div=num1/num2;
            System.out.println ("The divison result is "+ div);
        }

    }
}
