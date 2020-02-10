package Resource.basic_part1;

import java.util.Scanner;

public
class Calc {

    public static
    void main (String[] args) {

        Scanner sc = new Scanner ( System.in );
        System.out.println ("Enter The First Number" );
        int num1 = sc.nextInt ();

        System.out.println ("Enter The Second Number" );
        int num2 = sc.nextInt ();


        addition(num1,num2);
        subtraction(num1,num2);
        multiplication(num1,num2);
        division(num1,num2);
        modulus(num1,num2);


    }

    private static
    void addition (int num1 , int num2) {
        System.out.println (num1+num2 );
    }

    private static
    void subtraction(int num1 , int num2) {
        System.out.println (num1-num2 );
    }

    private static
    void multiplication(int num1 , int num2) {
        System.out.println (num1*num2 );
    }

    private static
    void division(int num1 , int num2) {
        System.out.println (num1/num2 );
    }

    private static
    void modulus(int num1 , int num2) {
        System.out.println (num1%num2 );
    }
}
