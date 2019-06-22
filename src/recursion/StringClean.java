package recursion;

import java.util.Scanner;

public class StringClean {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the String ");
        String str = scan.next();
        scan.close();

        System.out.println(stringClean(str));

    }

    public static String stringClean(String str) {

        if ( str.length() < 2 ) {
            return str;
        } else if ( str.charAt(0) == str.charAt(1) ) {
            return stringClean(str.substring(1));
        } else {
            return str.charAt(0) + stringClean(str.substring(1));
        }


    }

}
