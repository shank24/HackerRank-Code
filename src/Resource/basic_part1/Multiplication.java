package Resource.basic_part1;

import java.util.Scanner;

public
class Multiplication {

    public static
    void main (String[] args) {


        Scanner sc = new Scanner ( System.in );
        System.out.println ( "Enter The First Number" );
        int num1 = sc.nextInt ( );

        System.out.println ( "Enter The Second Number" );
        int num2 = sc.nextInt ( );

        int result = 0;


        result = num1 * num2;
        System.out.println ( result );

    }


}
