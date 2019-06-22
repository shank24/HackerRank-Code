package recursion;

import java.util.Scanner;

public class StrCopies {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the String ");
        String str = scan.next();

        System.out.println("Enter the Sub-String");
        String str1 = scan.next();

        System.out.println("Enter No. Of Iterations");
        int n = scan.nextInt();

        scan.close();

        System.out.println(strCopies(str, str1, n));

    }

    public static boolean strCopies(String str, String sub, int n) {

        if ( n == 0 ) {
            return true;
        }
        if ( str.length() < sub.length() ) {
            return false;
        }

        if ( str.substring(0, sub.length()).equals(sub) ) {
            return strCopies(str.substring(1), sub, n - 1);
        } else {
            return strCopies(str.substring(1), sub, n);
        }
    }

}
