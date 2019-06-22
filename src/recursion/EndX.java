package recursion;

import java.util.Scanner;

public class EndX {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the String ");
        String str = scan.next();
        scan.close();

        System.out.println(endX(str));

    }

    public static String endX(String str) {

        if ( str.length() <= 1 ) {
            return str;
        }

        else if(str.charAt(0)=='x'){
            return endX(str.substring(1))+'x';
        }
        else{
            return str.charAt(0)+endX(str.substring(1));
        }

    }

}
