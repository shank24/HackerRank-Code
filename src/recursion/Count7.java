package recursion;

import java.util.Scanner;


public class Count7 {

    //static int count;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number ");
        int n = scan.nextInt();
        scan.close();

        System.out.println(count7(n));
    }

    public static int count7(int number) {

        int x = number % 10;
        int n = number / 10;

        if ( n > 0 ) {
            if ( x == 7 ) {
                return 1 + count7(n);
            } else {
                return count7(n);
            }
        } else {
            if ( x == 7 ) {
                return 1;
            } else
                return 0;
        }



    }

}
