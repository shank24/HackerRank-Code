package days_30;

import java.util.Scanner;

public class Solution_5 {

	private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        
    	 //Scanner input = new Scanner(System.in);
    	 
    	 System.out.println("Enter the Number: ");
         int n = scanner.nextInt();
         for (int i = 1; i <= 10; i++) {
             System.out.printf("%d x  %d = %d\n", n, i, n*i);
         }
         
         

        scanner.close();
    }
    
}
