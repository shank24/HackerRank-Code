package recursion;

import java.util.Scanner;


public class Count7_1 {

    //static int count;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number ");
        int n = scan.nextInt();
        scan.close();

        System.out.println(count7(n));
    }

    public static int count7(int n) {

        if ( n < 1 ) {
            return 0;
        }
        if ( n % 10 == 7 ) {
            return 1 + count7(n / 10);
        } else {
            return count7(n / 10);
        }


    }

}
