package Resource.basic_part1;

import java.util.Scanner;

public
class DecimalToBinary {
    public static
    void main (String[] args) {

        Scanner sc = new Scanner ( System.in );
        System.out.println ( "Enter The Number" );
        int num1 = sc.nextInt ();

        System.out.println ( "Enter The Base Value" );
        int num2 = sc.nextInt ();

        checkBinary ( num1 , num2 );


    }

    private static
    void checkBinary (int num1 , int num2) {

        int arr[] = new int[100];

        int i = 0;

        while (num1 > 0) {
            arr[i++] = num1 % num2;
            num1=num1/num2;
        }


        for (int j = i-1 ; j >=0 ; j--) {
            System.out.print (arr[j] );
        }

        System.out.println ();

    }
}
