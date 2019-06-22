package recursion;

import java.util.Scanner;

public class Allstar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the String ");
        String str = scan.next();
        scan.close();

        System.out.println(allStar(str));

    }

    public static String allStar(String str) {

        if ( str.length() <= 1 ) {
            return str;
        }

        return str.charAt(0) + "*" + allStar(str.substring(1, str.length()));

    }

}
