package recursion;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number ");
        int n = scan.nextInt();
        scan.close();

        System.out.println(triangle(n));
    }

    public static int triangle(int rows) {

        if ( rows == 0 ) {
            return 0;
        } else {
            return rows + triangle(rows - 1);
        }
    }

}
