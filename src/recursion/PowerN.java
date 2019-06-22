package recursion;

import java.util.Scanner;

public class PowerN {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number ");
        int b = scan.nextInt();

        System.out.println("Enter the base");
        int n = scan.nextInt();

        scan.close();

        System.out.println(powerN(b,n));
    }

    public static int powerN(int base,int n) {

        if(n==1){
            return base;
        }
        else{
            return base*powerN(base,n-1);

        }
    }


}
