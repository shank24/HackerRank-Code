package string.misc;

import java.util.Scanner;

public
class String_Palindrome {

    public static
    void main (String[] args) {
        Scanner s = new Scanner ( System.in );

        System.out.println ( "Enter The String : " );

        String str = s.nextLine ( );

        palindrome ( str );

//        String response = palindrome ( str );
//        System.out.println (response );
    }

    public static
    void palindrome (String str) {

        int flag=0;

        for (int i = 0, j = str.length ( )-1; i < str.length ( )-1; i++ , j--) {

            if ( str.charAt ( i ) == str.charAt ( j ) ) {
                flag=1;
            } else {
                flag=0;
            }

        }

        if(flag==1){
            System.out.println ("Yes" );
        }
        else{
            System.out.println ("No" );
        }
    }
}
