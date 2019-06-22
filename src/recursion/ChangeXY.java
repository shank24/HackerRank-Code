package recursion;

import java.util.Scanner;

public class ChangeXY {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the String ");
        String str = scan.next();
        scan.close();

        System.out.println(changeXY(str));
    }

    private static String changeXY(String str) {

        if ( str.length() == 0 ) {
            return str;
        }
        if ( str.charAt(0) == 'x' ) {
            return 'y' + changeXY(str.substring(1));
        } else {

            return str.charAt(0) + changeXY(str.substring(1));
        }
    }

}
