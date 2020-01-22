/*
Problem Statement:-

The elements of a String are called characters.
The number of characters in a String is called the length,
and it can be retrieved with the String.length() method.

Given two strings of lowercase English letters,  and , perform the following operations:

Sum the lengths of  A and B.
Determine if  is lexicographically larger than  (i.e.: does  come before  in the dictionary?).
Capitalize the first letter in  and  and print them on a single line, separated by a space.

The first line contains a string .
The second line contains another string .
The strings are comprised of only lowercase English letters.


There are three lines of output:
For the first line, sum the lengths of  and .
For the second line, write Yes if  is lexicographically greater than  otherwise print No instead.
For the third line, capitalize the first letter in both  and  and print them on a single line, separated by a space.

*/
package Java_Practice_Hacker_Rank;

import java.util.Scanner;

public class Solution_14 {

    public static void main(String[] args) {

        Scanner sc =new Scanner( System.in);
        String  A  =sc.next();
        String  B  =sc.next();
        /* Enter your code here. Print output to STDOUT. */

        int length = find_Length(A,B);
        System.out.println(length);

        String result = checkLexicographical(A,B);
        System.out.println(result);

        String camelCase = concate(A,B);
        System.out.println(camelCase);
    }

    private static String checkLexicographical(String a, String b) {

        String res="";

        int val1 = a.charAt(0);
        int val2 = b.charAt(0);



        if(val1>val2){
            res="Yes";
        }
        else{
            res="No";
        }


        return res;
    }

    private static String concate(String a, String b) {
        return a.substring(0,1).toUpperCase()+a.substring(1,a.length())+" "+b.substring(0,1).toUpperCase()+b.substring(1,b.length());
    }

    private static int find_Length(String a, String b) {
        return a.length()+b.length();
    }
}



