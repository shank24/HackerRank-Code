package java8Features.constructors;

public class MyClass {
    private String s;

    MyClass(String s){
        this.s=s;
        System.out.println("Inside the Constructor: "+s);
    }

}
