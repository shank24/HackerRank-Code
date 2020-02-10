package Resource.basic_part1;

import java.util.Scanner;

public
class Circle_Area {
    public static
    void main (String[] args) {
        Scanner sc = new Scanner ( System.in );

        System.out.println ( "Enter The Radius" );
        double num1 = sc.nextDouble ( );

        double perimeter = 2 * 3.14 * num1;
        double area      = 3.14 * Math.pow ( num1 , 2 );

        System.out.println ( "Perimeter of a circle " + perimeter );
        System.out.println ( "Area of a circle " + area );

    }
}
