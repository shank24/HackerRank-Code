package Java_Practice_Hacker_Rank;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public
class Solution_13 {


    public static
    void main (String[] args) {
        Scanner scanner = new Scanner ( System.in );
        double  payment = scanner.nextDouble ( );
        scanner.close ( );


        Locale inrLocale = new Locale ( "en" , "IN" );

        //Create Number Formats using Locales
        NumberFormat us = NumberFormat.getCurrencyInstance ( Locale.US );

        NumberFormat india = NumberFormat.getCurrencyInstance ( inrLocale );

        NumberFormat china = NumberFormat.getCurrencyInstance ( Locale.CHINA );

        NumberFormat france = NumberFormat.getCurrencyInstance ( Locale.FRANCE );

        System.out.println ( "US: " + us.format ( payment ) );
        System.out.println ( "India: " + india.format ( payment ) );
        System.out.println ( "China: " + china.format ( payment ) );
        System.out.println ( "France: " + france.format ( payment ) );
    }
}
