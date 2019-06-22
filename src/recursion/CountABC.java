package recursion;

import java.util.Scanner;

public class CountABC {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the String ");
        String str = scan.next();
        scan.close();

        System.out.println(countABC(str));

    }

    public static int countABC(String str) {

        if ( str.equals("") || str.length() < 3 ) {
            return 0;
        } else if ( (str.charAt(0) =='a' && str.charAt(1) =='b') && (str.charAt(2)=='c' || str.charAt(2)=='a') ) {
            return 1 + countABC(str.substring(1));
        } else {
            return countABC(str.substring(1));
        }


    }

}
