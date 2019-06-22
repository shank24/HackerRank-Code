package recursion;

import java.util.Scanner;


public class CountHi2 {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the String ");
        String str = scan.next();
        scan.close();

        System.out.println(countHi2(str));
    }

    public static int countHi2(String str) {

        int len = str.length();

        if ( len < 2 ) return 0;

        if ( str.substring(len - 2, len).equals("hi") ) {
            if ( (len > 2 && str.charAt(len - 3) != 'x')/* || len == 2 */)
                return 1 + countHi2(str.substring(0, len - 1));
        }
        return countHi2(str.substring(0, len - 1));


    }

}
