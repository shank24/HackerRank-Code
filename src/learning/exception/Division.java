package learning.exception;

import java.util.Scanner;

public
class Division {
    public static
    void main (String[] args) {

        int a, b, c;

        try {
            System.out.println ( "Enter 2 integers" );

            Scanner sc = new Scanner ( System.in );
            a = sc.nextInt ( );
            b = sc.nextInt ( );

            c = a / b;
            System.out.println ( "Result " + c );

        }
        catch (ArithmeticException r) {
            System.out.println ( "Caught" );
        }
        catch (Exception e) {
            System.out.println ( "Please do no enter 0" );
        }
        finally {
            //System.exit ( 0 );
            System.out.println ( "In Finally Block" );
        }
        System.out.println ( "More Code to go here" );
    }
}
