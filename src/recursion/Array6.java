package recursion;

import java.util.Scanner;

public class Array6 {

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

        System.out.println(array6(arr, index));
    }


    public static boolean array6(int[] nums, int index) {

        if ( index >= nums.length ) {
            return false;
        }
        if ( nums[index] == 6 ) {
            return true;
        } else {
            return array6(nums, index + 1);
        }
    }
}


/*
  if(index >= nums.length)
        return false;

    return nums[index] == 6 || array6(nums, index + 1);
 */