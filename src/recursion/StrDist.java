package recursion;

import java.util.Scanner;

public class StrDist {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the String ");
        String str = scan.next();

        System.out.println("Enter the Sub-String");
        String str1 = scan.next();

        System.out.println();

        scan.close();

        System.out.println(strDist(str, str1));

    }

    public static int strDist(String str, String sub) {


        if ( str.length() < sub.length() ) {
            return 0;
        }
        // comparing from 0,3 && 9-3 == (6,9) == sub
        if ( str.substring(0, sub.length()).equals(sub) && str.substring(str.length() - sub.length()).equals(sub) ) {
            return str.length();
        }
        boolean str2= !str.substring(0, sub.length()).equals(sub);
        System.out.println(str2);


        if ( !str.substring(0, sub.length()).equals(sub) ) {
            return strDist(str.substring(1), sub);
        } else {
            return strDist(str.substring(0, str.length() - 1), sub);
        }

    }
}
