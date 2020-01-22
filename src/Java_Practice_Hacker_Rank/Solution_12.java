package Java_Practice_Hacker_Rank;

import java.time.LocalDate;
import java.util.Scanner;

public
class Solution_12 {


    public static
    void main (String[] args) {

        Scanner sc = new Scanner ( System.in );
        System.out.println ( "Enter the Month:" );
        int m = sc.nextInt ( );

        System.out.println ( "Enter the Day:" );
        int d = sc.nextInt ( );

        System.out.println ( "Enter the year:" );
        int y = sc.nextInt ( );

        String completedate = findDay ( m , d , y );
        System.out.println ( "The Conversion is:  " + completedate );

    }
    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static
    String findDay (int month , int day , int year) {

        LocalDate dt = LocalDate.of ( year , month , day );
        return dt.getDayOfWeek ( ).toString ( );
    }


}
