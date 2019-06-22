package recursion;

import java.util.Scanner;

public class Count11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the String ");
        String str = scan.next();
        scan.close();

        System.out.println(count11(str));

    }

    public static int count11(String str) {

        if ( str.length() < 2 ) {
            return 0;
        } else if ( str.substring(0,2).equals("11") ) {
            return 1 + count11(str.substring(2));
        } else {
            return count11(str.substring(1));
        }


    }

}
