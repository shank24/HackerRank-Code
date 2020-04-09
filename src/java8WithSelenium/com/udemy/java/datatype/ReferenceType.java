package java8WithSelenium.com.udemy.java.datatype;

import java.util.Arrays;

public class ReferenceType {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};

        System.out.println("Before" + Arrays.toString(arr));
        change(arr);
        System.out.println("After" + Arrays.toString(arr));


    }

    private static void change(int arr[]){
        arr[0]++;
        arr[1]++;
        arr[2]++;
    }
}

