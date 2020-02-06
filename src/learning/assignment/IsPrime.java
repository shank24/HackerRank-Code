package learning.assignment;

import java.util.Scanner;

public
class IsPrime {
    public static
    void main (String[] args) {

        Scanner sc = new Scanner ( System.in );
        System.out.println ("Enter the Number" );
        int num = sc.nextInt ();

        boolean result = isPrime(num);
        System.out.println (result );



    }

    private static
    boolean isPrime (int num) {

        boolean primeFlag=true;

        for (int i = 2; i < num-1; i++) {
            if(num%i==0){
                primeFlag=false;
            }

        }

        if(primeFlag==true){
            return true;
        }
        else{
            return false;
        }
    }


}
