package recursion;

import java.util.Scanner;

public class Array11 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the Index : ");
        int index = scan.nextInt();

        int arr[] = new int[index];

        System.out.println("Enter the Elements: ");

        for (int i = 0; i < index; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.println("Printing the Elements: ");
        /*for (int j=0;j<index;j++){
            System.out.print(arr[j] + " ");
        }*/

        scan.close();

        System.out.println(array11(arr, index));
    }


    public static int array11(int[] nums, int index) {

        if ( index >= nums.length ) {
            return 0;
        }
        if ( nums[index] == 11 ) {
            return 1 + array11(nums, index + 1);
        } else {
            return array11(nums, index + 1);
        }
    }
}


