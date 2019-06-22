package string;

import java.util.Scanner;

public class String_Lexico {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }

    public static String getSmallestAndLargest(String s, int k) {
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        String first = null, second = null;

        for (int i = 0; i < s.length() - k + 1; i++) {
            String temp = s.substring(i, i + k);

            if ( first == null ) {
                first = temp;
                second = temp;
            } else {
                if ( temp.compareTo(first) < 0 ) {
                    first = temp;
                } else if ( temp.compareTo(second) > 0 ) {
                    second = temp;
                }
            }
        }


        return first + "\n" + second;
    }
}

