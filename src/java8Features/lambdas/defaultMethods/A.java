package java8Features.lambdas.defaultMethods;

public interface A {
    default void m1(){
        System.out.println("Default in Interface A ");
    }
}
