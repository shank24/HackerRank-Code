package learning.assignment.array;

public
class StringReverse {
    public static
    void main (String[] args) {

        String arr[] = new String[4];
        arr[0]="Java";
        arr[1]="Is";
        arr[2]="Good";
        arr[3]="Language";

        for (int i=arr.length-1;i>=0;i--){
            System.out.println (arr[i] );
        }

    }
}
