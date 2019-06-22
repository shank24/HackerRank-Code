package recursion;

import java.util.Scanner;

public class CountPairs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the String ");
        String str = scan.next();
        scan.close();

        System.out.println(countPairs(str));

    }

    public static int countPairs(String str) {

        if ( str.equals("") || str.length() < 3 ) {
            return 0;
        } else if ( str.charAt(0) == str.charAt(2) ) {
            return 1 + countPairs(str.substring(1));
        } else {
            return countPairs(str.substring(1));
        }


    }

}
