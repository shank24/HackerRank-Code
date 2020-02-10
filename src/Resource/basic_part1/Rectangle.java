package Resource.basic_part1;

import java.util.Scanner;

public
class Rectangle {
    public static
    void main (String[] args) {

        Scanner sc = new Scanner ( System.in );
        System.out.println ("Enter The First Number" );
        double num1 = sc.nextDouble ();

        System.out.println ("Enter The Second Number" );
        double num2 = sc.nextDouble ();


        System.out.println ("Area is : " + num1*num2);
        System.out.println ("Perimeter is : " + 2*(num1+num2) );


    }
}
