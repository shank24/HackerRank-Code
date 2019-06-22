package recursion;

import java.util.Scanner;


public class Counthi {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the String ");
        String str = scan.next();
        scan.close();

        System.out.println(countHi(str));
    }

    public static int countHi(String str) {

        if(str.length()<2){
            return 0;
        }
        else if(str.substring(0,2).equalsIgnoreCase("hi")){
            return 1+countHi(str.substring(2));
        }
        else{
            return countHi(str.substring(1));
        }



    }

}
