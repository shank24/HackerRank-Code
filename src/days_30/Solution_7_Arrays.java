package days_30;

import java.util.Scanner;

public class Solution_7_Arrays {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		
		System.out.println("Enter the Range");
		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int[] arr = new int[n];


		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}
		
		
		System.out.println("Your Numbers In Reverse");
		for (int i = n-1; i >= 0; i--) {
			System.out.print(arr[i]);
		}
		

		scanner.close();
	}
}
