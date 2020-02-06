package learning.assignment;

import java.util.Scanner;

public
class GradingApp {
    public static
    void main (String[] args) {

        Scanner sc =  new Scanner ( System.in );
        System.out.println ("Enter Maths Marks" );
        int maths = sc.nextInt ();

        System.out.println ("Enter Science Marks" );
        int science = sc.nextInt ();

        System.out.println ("Enter Physics Marks" );
        int physics = sc.nextInt ();

        String result = checkGrade(maths,science,physics);
        System.out.println (result );

    }

    private static
    String checkGrade (int maths , int science , int physics) {

        int average = (maths+science+physics)/3;
        if(maths<35 || science<35 || physics <35){
            return "FAIL";
        }
        else{
            if(average>=35 && average<=59){
                return "C";
            }
            else if(average>=35 && average<=69){
                return "B";
            }
            else{
                return "A";
            }
        }
    }

}
