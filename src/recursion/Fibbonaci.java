package recursion;

import java.util.Scanner;

public class Fibbonaci {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number ");
        int n = scan.nextInt();
        scan.close();

        while (n!=0){
            System.out.println(fibbo(n));
            n=n-1;
        }

    }

    public static int fibbo(int n){
        if(n==1 || n==2){
            return n-1;
        }

        else {
            return fibbo(n-1) + fibbo(n-2);
        }
    }
}
