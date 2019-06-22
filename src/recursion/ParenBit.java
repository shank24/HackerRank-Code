package recursion;

import java.util.Scanner;

public class ParenBit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the String ");
        String str = scan.next();
        scan.close();

        System.out.println(parenBit(str));

    }

    public static String parenBit(String str) {

        if ( str.length() == 0 ) return "";
        if ( str.charAt(0) == '(' ) {
            if ( str.charAt(str.length() - 1) == ')' ) {
                return str;
            } else {
                return parenBit(str.substring(0, str.length() - 1));
            }
        } else {
            return parenBit(str.substring(1));
        }

    }

}
