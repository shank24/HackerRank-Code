package Java_Practice_Hacker_Rank;

import java.util.Scanner;

public
class Solution_18 {


    public static
    void main (String[] args) {
        Scanner scan = new Scanner ( System.in );
        String  a    = scan.next ( );
        String  b    = scan.next ( );
        scan.close ( );
        boolean ret = isAnagram ( a , b );
        System.out.println ( (ret) ? "Anagrams" : "Not Anagrams" );
    }

    public static
    boolean isAnagram (String a , String b) {

        if ( a.length ( ) != b.length ( ) ) return false;

        int flag=0;
        a = a.toLowerCase ( );
        b = b.toLowerCase ( );

        int[] letters = new int[1 << 8];

        for (char c : a.toCharArray ( )) {
            letters[c]++;
            System.out.println ( c  + letters[c] );

        }

        System.out.println ( );

        for (char c : b.toCharArray ( )) {
            letters[c]--;
            System.out.println ( c + letters[c] );
        }



        for (int i : letters) {
            if ( i != 0 ) // Checking, it is not NULL
            {
                flag=0;
            }else{
                flag=1;
            }
        }
        if(flag==1) {
            return true;
        }
        else{
            return false;
        }
    }
}
