package recursion;

import java.util.Scanner;

public class StrCount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the String ");
        String str = scan.next();

        System.out.println("Enter the Sub-String");
        String str1 = scan.next();

        System.out.println();

        scan.close();

        System.out.println(strCount(str, str1));

    }

    public static int strCount(String str, String sub) {

        if ( str.length() < sub.length() ) {
            return 0;
        }
        if ( str.substring(0, sub.length()).equals(sub) ) {

            /*
            This below statement will just remove the first 3 chars from the main String and left over with (actual-length of the substring)
            Like (catcowcat - cowcat) = (cowcat,cat)
             */
            return 1 + strCount(str.substring(sub.length()), sub);
        } else {
            /*
            This statement will just increase the counter of the string by 1 index.
            catcow --> atcow --> tcow --> cow.
             */
            return strCount(str.substring(1), sub);
        }
    }

}
