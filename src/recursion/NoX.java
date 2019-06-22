package recursion;

import java.util.Scanner;

public class NoX {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the String ");
        String str = scan.next();
        scan.close();

        System.out.println(removeX(str));
    }

    private static String removeX(String str) {

        if(str.length()==0){
            return "";
        }
        else if(str.charAt(0)=='x'){
            return  ""+removeX(str.substring(1));
        }
        else{
            return str.charAt(0) + removeX(str.substring(1));
        }

    }


}
