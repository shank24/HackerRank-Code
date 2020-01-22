package misc;


import java.util.*;

class ReverseArray {
    public static void main(String args[] ) throws Exception {

        // Write your code here
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int i[] =  new int [size];

        for(int a=0;a<size;a++){
            i[a]=s.nextInt();
        }
        for(int a=i.length-1;a>=0;a--){
            System.out.println(i[a]);
        }

    }
}