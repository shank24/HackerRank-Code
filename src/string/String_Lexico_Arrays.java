package string;

import java.util.Scanner;

public
class String_Lexico_Arrays {
    public static
    void main (String[] args) {
        Scanner n = new Scanner ( System.in );
        System.out.println ( "Enter Number Of Strings : " );
        int nos = n.nextInt ( );

        String arr[] = new String[nos];

        System.out.println ( "Enter " + nos + " Strings in sequence :" );
        for (int i = 0; i < arr.length; i++) {
            arr[i] = n.next ( );
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println ( arr[i] );
        }

        sort ( arr );
    }

    private static
    void sort (String[] arr) {

        String temp;
        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if ( arr[i].compareTo ( arr[j] ) > 0 ) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }


            System.out.println ( "Sorted Arrays : " );

            for (int k = 0; k < arr.length; k++) {
                System.out.println ( arr[k] );
            }
        }

    }
}
