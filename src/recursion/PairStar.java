package recursion;

import java.util.Scanner;

public class PairStar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the String ");
        String str = scan.next();
        scan.close();

        System.out.println(pairStar(str));

    }

    public static String pairStar(String str) {

        if ( str.length() <= 1 ) {
            return str;
        }

        else if(str.charAt(0)==str.charAt(1)){
            return str.charAt(0) + "*" + pairStar(str.substring(1));
        }

        else{
            return str.charAt(0)+ pairStar(str.substring(1));
        }


    }

}
