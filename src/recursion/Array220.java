package recursion;

import java.util.Scanner;

public class Array220 {

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

        System.out.println(array220(arr, index));
    }


    public static boolean array220(int[] nums, int index) {

        if ( index >= nums.length - 1 ) {
            return false;
        }
        if ( (nums[index] * 10) == nums[index + 1] ) {
            return true;
        } else {
            return array220(nums, index + 1);
        }
    }
}


