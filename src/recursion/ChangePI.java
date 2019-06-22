package recursion;

import java.util.Scanner;

public class ChangePI {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the String ");
        String str = scan.next();
        scan.close();

        System.out.println(changePi(str));
    }

    private static String changePi(String str) {

        if(str.length() <= 1) {
            return str;
        }
        if ( str.substring(0, 2).equals("pi") ) {
            return "3.14" + changePi(str.substring(2));
        } else {

            return str.charAt(0) + changePi(str.substring(1));
        }
    }

}
