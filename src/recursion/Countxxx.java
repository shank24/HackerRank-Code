package recursion;

import java.util.Scanner;


public class Countxxx {

    //static int count;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the String ");
        String str = scan.next();
        scan.close();

        System.out.println(countx(str));
    }

    public static int countx(String str) {

        if(str.length()==0){
            return 0;
        }
        if(str.charAt(0)=='x'){
            return 1+countx(str.substring(1));
        }
        else{
            return countx(str.substring(1));
        }

    }

}
