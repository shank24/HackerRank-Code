package java8WithSelenium.com.udemy.java.datatype;

public class PrimitiveType {

    public static void main(String[] args) {

        int a=5;
        System.out.println("Before Incrementing");
        System.out.println(a);
        change(a);
        System.out.println("After Incrementing");
        System.out.println(a);
    }

    private static void change(int a){
        a++;
    }


}
