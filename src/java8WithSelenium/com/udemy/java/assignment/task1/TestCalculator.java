package java8WithSelenium.com.udemy.java.assignment.task1;

public class TestCalculator {
    public static void main(String[] args) {

      MathOperation add = (a,b)->(a+b);
      MathOperation sub =(a,b) -> (a-b);
      MathOperation mul =(a,b) -> (a*b);
      MathOperation div =(a,b) -> (a/b);

        /*System.out.println(calculate(add));
        System.out.println(calculate(sub));
        System.out.println(calculate(mul));
        System.out.println(calculate(div));
        */


        int onScreenNumber=0;

        onScreenNumber = calculate(5,add,2);
        onScreenNumber = calculate(onScreenNumber,sub,3);
        onScreenNumber = calculate(onScreenNumber,mul,7);
        onScreenNumber = calculate(onScreenNumber,add,2);
        onScreenNumber=calculate(onScreenNumber,div,3);




        System.out.println(onScreenNumber);

    }

    /*private static int calculate(MathOperation mathOperation){
        int a=100;
        int b=50;
        return mathOperation.operate(a,b);
    }*/

    private static int calculate(int onScreenNumber, MathOperation mathOperation, int enteredNumber){
        return mathOperation.operate(onScreenNumber,enteredNumber);
    }
}
