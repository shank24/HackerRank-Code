package string.gfgeeks;

import java.util.Scanner;

public
class CopyString {

    public static
    void main (String[] args) {

        Scanner sc = new Scanner ( System.in );
        System.out.println ("Enter the String 1 " );

        String str = sc.nextLine ();
        char ch1[] = str.toCharArray ();
        char ch2[] = new char[ch1.length];

        myCopy(ch1,ch2);

        System.out.println ("Output " + String.valueOf ( ch2 ) );



    }

    private static
    void myCopy (char[] ch1 , char[] ch2) {

        for(int i=0;i<ch1.length;i++){
            ch2[i] = ch1[i];
        }

    }

}

