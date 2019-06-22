package recursion;

import java.util.Scanner;

public class NestParen {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the String ");
        String str = scan.next();
        scan.close();

        System.out.println(nestParen(str));

    }

    public static boolean nestParen(String str) {

        if ( str.equals("") ) return true;

        if ( str.charAt(0) == '(' && str.charAt(str.length() - 1) == ')' ) {

            return nestParen(str.substring(1, str.length() - 1));
        } else {
            return false;
        }

    }

}
