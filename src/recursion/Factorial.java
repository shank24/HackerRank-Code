package recursion;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number ");
        int n = scan.nextInt();
        scan.close();

        System.out.println(fact(n));
    }

    public static int fact(int number){

        if(number==0){
            return 1;
        }
        else{
            return number*fact(number-1);
        }
    }
}
