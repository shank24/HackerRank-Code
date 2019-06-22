package recursion;

import java.util.Scanner;

public class Sum_Of_Digits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number ");
        int n = scan.nextInt();
        scan.close();

        System.out.println(sumDigits(n));
    }

    public static int sumDigits(int number) {

        if ( number == 0 ) {
            return 0;
        } else {
            return number%10+sumDigits(number /10);
        }
    }

}
